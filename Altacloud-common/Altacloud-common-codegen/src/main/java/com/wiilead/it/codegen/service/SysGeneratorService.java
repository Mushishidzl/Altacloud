package com.wiilead.it.codegen.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.wiilead.it.codegen.entity.GenConfig;

import java.util.List;
import java.util.Map;

/**
 * @ClassName: SysGeneratorService
 * @Description:
 * @Author mushishi
 * @Date 2019/4/19-14:32
 */
public interface SysGeneratorService {

    /**
     * 生成代码
     *
     * @param tableNames 表名称
     * @return
     */
    byte[] generatorCode(GenConfig tableNames);

    /**
     * 分页查询表
     *
     * @param tableName 表名
     * @return
     */
    IPage<List<Map<String, Object>>> queryPage(Page page, String tableName);
}
