package com.wiilead.it.workflow;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @ClassName: AltacloudWorkflowApplication
 * @Description: 流程引擎启动类
 * @Author mushishi
 * @Date 2019/4/30-14:34
 */
@EnableCaching
@EnableHystrix
@EnableFeignClients
@EnableDiscoveryClient
@SpringBootApplication
@EnableTransactionManagement
public class AltacloudWorkflowApplication {

    public static void main(String [] args){
        SpringApplication.run(AltacloudWorkflowApplication.class,args);
    }
}
