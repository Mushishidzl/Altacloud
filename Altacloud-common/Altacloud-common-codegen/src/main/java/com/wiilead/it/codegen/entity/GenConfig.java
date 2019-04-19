package com.wiilead.it.codegen.entity;

import lombok.Data;

/**
 * @ClassName: GenConfig
 * @Description: 生成配置
 * @Author mushishi
 * @Date 2019/4/19-14:27
 */
@Data
public class GenConfig {

    /**
     * 包名
     */
    private String packageName;
    /**
     * 作者
     */
    private String author;
    /**
     * 模块名称
     */
    private String moduleName;
    /**
     * 表前缀
     */
    private String tablePrefix;

    /**
     * 表名称
     */
    private String tableName;

    /**
     * 表备注
     */
    private String comments;
}
