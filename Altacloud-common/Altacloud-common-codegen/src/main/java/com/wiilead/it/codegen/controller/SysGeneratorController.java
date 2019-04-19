package com.wiilead.it.codegen.controller;

import cn.hutool.core.io.IoUtil;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.wiilead.it.codegen.entity.GenConfig;
import com.wiilead.it.codegen.service.SysGeneratorService;
import com.wiilead.it.model.ResultVO;
import lombok.AllArgsConstructor;
import lombok.SneakyThrows;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;

/**
 * @ClassName: SysGeneratorController
 * @Description: 代码生成器
 * @Author mushishi
 * @Date 2019/4/19-14:48
 */
@RestController
@AllArgsConstructor
@RequestMapping("/generator")
public class SysGeneratorController {

    private final SysGeneratorService sysGeneratorService;


    /**
     * 生成代码
     */
    @PostMapping("/code")
    @SneakyThrows
    public void code(@RequestBody GenConfig genConfig, HttpServletResponse response) {
        byte[] data = sysGeneratorService.generatorCode(genConfig);

        response.reset();
        response.setHeader("Content-Disposition", String.format("attachment; filename=%s.zip", genConfig.getTableName()));
        response.addHeader("Content-Length", "" + data.length);
        response.setContentType("application/octet-stream; charset=UTF-8");

        IoUtil.write(response.getOutputStream(), Boolean.TRUE, data);
    }
}
