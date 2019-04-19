package com.wiilead.it.common.db.config;

import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import lombok.Data;
import org.apache.ibatis.reflection.MetaObject;

import java.util.Date;

/**
 * @ClassName: DataCommonObject
 * @Description: 自定义公共填充字段
 * @Author mushishi
 * @Date 2019/4/19-10:47
 */
public class DataCommonObject implements MetaObjectHandler {

    private final static String UPDATE_TIME = "updateDate";
    private final static String CREATE_TIME = "createDate";

    /**
     * 插入填充，字段为空自动填充
     */
    @Override
    public void insertFill(MetaObject metaObject) {
        Object createTime = getFieldValByName(CREATE_TIME, metaObject);
        Object updateTime = getFieldValByName(UPDATE_TIME, metaObject);
        if (createTime == null || updateTime == null) {
            Date date = new Date();
            if (createTime == null) {
                setFieldValByName(CREATE_TIME, date, metaObject);
            }
            if (updateTime == null) {
                setFieldValByName(UPDATE_TIME, date, metaObject);
            }
        }
    }

    /**
     * 更新填充
     *
     * @param metaObject
     */
    @Override
    public void updateFill(MetaObject metaObject) {
        //mybatis-plus版本2.0.9+
        setFieldValByName(UPDATE_TIME, new Date(), metaObject);
    }
}
