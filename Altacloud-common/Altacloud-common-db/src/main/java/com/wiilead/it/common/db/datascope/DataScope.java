package com.wiilead.it.common.db.datascope;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.HashMap;
import java.util.List;

/**
 * @ClassName: DataScope
 * @Description: 数据拦截范围
 * @Author mushishi
 * @Date 2019/4/19-9:57
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class DataScope extends HashMap {

    /**
     * 限制范围的字段名称
     */
    private String scopeName = "officeId";

    /**
     * 具体的数据范围
     */
    private List<String> officeIds;

    /**
     * 是否只查询本部门
     */
    private Boolean isOnly = false;
}
