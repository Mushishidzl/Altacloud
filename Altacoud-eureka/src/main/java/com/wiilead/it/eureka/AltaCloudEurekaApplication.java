package com.wiilead.it.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;


/**
 * @ClassName: AltaCloudEurekaApplication
 * @Description: 注册发现
 * @Author mushishi
 * @Date 2019/4/17-11:56
 */
@SpringBootApplication
@EnableEurekaServer
public class AltaCloudEurekaApplication {

    /**
     * 注册发现
     * @param args
     */
    public static void main(String[] args) {
        SpringApplication.run(AltaCloudEurekaApplication.class, args);
    }
}
