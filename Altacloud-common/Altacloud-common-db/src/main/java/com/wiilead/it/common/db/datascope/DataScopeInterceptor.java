package com.wiilead.it.common.db.datascope;

import cn.hutool.core.collection.CollectionUtil;
import cn.hutool.core.util.StrUtil;
import com.baomidou.mybatisplus.core.toolkit.PluginUtils;
import com.baomidou.mybatisplus.extension.handlers.AbstractSqlParserHandler;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.executor.statement.StatementHandler;
import org.apache.ibatis.mapping.BoundSql;
import org.apache.ibatis.mapping.MappedStatement;
import org.apache.ibatis.mapping.SqlCommandType;
import org.apache.ibatis.plugin.*;
import org.apache.ibatis.reflection.MetaObject;
import org.apache.ibatis.reflection.SystemMetaObject;

import java.sql.Connection;
import java.util.List;
import java.util.Map;
import java.util.Properties;

/**
 * @ClassName: DataScopeInterceptor
 * @Description: 数据拦截器
 * @Author mushishi
 * @Date 2019/4/19-10:03
 */
@Slf4j
@Intercepts({@Signature(type = StatementHandler.class, method = "prepare", args = {Connection.class, Integer.class})})
public class DataScopeInterceptor extends AbstractSqlParserHandler implements Interceptor {

    /**
     * 拼接sql
     * @param invocation
     * @return
     */
    @Override
    @SneakyThrows
    public Object intercept(Invocation invocation){
        StatementHandler statementHandler = (StatementHandler)PluginUtils.realTarget(invocation.getTarget());
        MetaObject metaObject = SystemMetaObject.forObject(statementHandler);
        this.sqlParser(metaObject);

        // 判断是否是查询的操作
        MappedStatement metaObjectValue = (MappedStatement) metaObject.getValue("delegate.mappedStatement");
        if(!SqlCommandType.SELECT.equals(metaObjectValue.getSqlCommandType())){
            return invocation.proceed();
        }
        BoundSql boundSql = (BoundSql) metaObject.getValue("delegate.boundSql");
        String originalSql = boundSql.getSql();
        Object parameterObject = boundSql.getParameterObject();

        //查找参数中包含DataScope类型的参数
        DataScope dataScope = findDataScope(parameterObject);

        if (dataScope == null) {
            return invocation.proceed();
        } else {
            String scopeName = dataScope.getScopeName();
            List<String> officeIds = dataScope.getOfficeIds();
            if (StrUtil.isNotBlank(scopeName) && CollectionUtil.isNotEmpty(officeIds)) {
                String join = CollectionUtil.join(officeIds, ",");
                originalSql = "select * from (" + originalSql + ") temp_data_scope where temp_data_scope." + scopeName + " in (" + join + ")";
                metaObject.setValue("delegate.boundSql.sql", originalSql);
            }
            return invocation.proceed();
        }
    }

    /**
     * 生成拦截对象的代理
     * @param obj   目标对象
     * @return  代理对象
     */
    @Override
    public Object plugin(Object obj) {
        if(obj instanceof StatementHandler){
            return Plugin.wrap(obj,this);
        }
        return obj;
    }

    /**
     * mybatis配置的属性
     * @param properties
     */
    @Override
    public void setProperties(Properties properties) {

    }

    /**
     * 判断参数是否包含DataScope对象
     * @param object
     * @return
     */
    private DataScope findDataScope(Object object){
        if(object instanceof DataScope){
            return (DataScope) object;
        }else if(object instanceof Map){
            for(Object val: ((Map<?,?>)object).values()){
                if(val instanceof DataScope){
                    return (DataScope) val;
                }
            }
        }
        return null;
    }
}
