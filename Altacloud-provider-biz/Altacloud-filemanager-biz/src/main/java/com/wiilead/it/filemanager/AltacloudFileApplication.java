package com.wiilead.it.filemanager;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @ClassName: AltacloudFileApplication
 * @Description: 文件管理系统启动类
 * @Author mushishi
 * @Date 2019/4/30-13:49
 */
@EnableCaching
@EnableHystrix
@EnableFeignClients
@EnableDiscoveryClient
@SpringBootApplication
@EnableTransactionManagement
public class AltacloudFileApplication {

    public static void main(String[] args) {
        SpringApplication.run(AltacloudFileApplication.class, args);
    }


}
