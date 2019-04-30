package com.wiilead.it.form;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @ClassName: AltacoudFormApplication
 * @Description: 动态表单的启动类
 * @Author mushishi
 * @Date 2019/4/30-13:59
 */
// 缓存注释
@EnableCaching
// 启动熔断降级服务
@EnableHystrix
// 扫描标记了@FeignClient的接口并创建实例bean
@EnableFeignClients
// 向注册中心注册服务
@EnableDiscoveryClient
// 复合注解
@SpringBootApplication
// 开启事务注解
@EnableTransactionManagement
public class AltacoudFormApplication {


    public static void main(String[] args) {
        SpringApplication.run(AltacoudFormApplication.class, args);
    }

}
