package com.wiilead.it.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @ClassName: AltaCloudConfigApplication
 * @Description: 配置中心启动
 * @Author mushishi
 * @Date 2019/4/17-14:19
 */
@SpringBootApplication
@EnableConfigServer
public class AltaCloudConfigApplication {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        SpringApplication.run(AltaCloudConfigApplication.class, args);
    }
}
