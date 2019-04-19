package com.wiilead.it.sysmanager.biz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @ClassName: AltacloudSysmanagerApplication
 * @Description: 系统模块启动
 * @Author mushishi
 * @Date 2019/4/19-13:56
 */
@EnableCaching
@EnableHystrix
@EnableFeignClients
@EnableDiscoveryClient
@SpringBootApplication
@EnableTransactionManagement
public class AltacloudSysmanagerApplication {

    public static void  main(String [] args){
        SpringApplication.run(AltacloudSysmanagerApplication.class,args);
    }
}
