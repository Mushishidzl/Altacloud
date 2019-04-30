package com.wiilead.it.alm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @ClassName: AltacloudAlmAppication
 * @Description: alm 启动类
 * @Author mushishi
 * @Date 2019/4/30-11:51
 */
@EnableCaching
@EnableHystrix
@EnableFeignClients
@EnableDiscoveryClient
@SpringBootApplication
@EnableTransactionManagement
public class AltacloudAlmAppication {


    public static void  main(String [] args){
        SpringApplication.run(AltacloudAlmAppication.class,args);
    }

}
