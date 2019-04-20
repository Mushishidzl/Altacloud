package com.wiilead.it.codegen.config;

import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @ClassName: MybatisPlusConfig
 * @Description: 配置
 * @Author mushishi
 * @Date 2019/4/19-14:28
 */
@Configuration
@MapperScan("com.wiilead.it.codegen.mapper")
public class MybatisPlusConfig {


    /**
     * 分页插件
     *
     * @return PaginationInterceptor
     */
    @Bean
    public PaginationInterceptor paginationInterceptor() {
        return new PaginationInterceptor();
    }
}
