package com.wiilead.it.zipkin;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.context.annotation.Bean;
import zipkin.storage.mysql.MySQLStorage;
import zipkin2.server.internal.EnableZipkinServer;

import javax.sql.DataSource;

/**
 * @ClassName: AltacloudZipkinController
 * @Description: 链路跟踪
 * @Author mushishi
 * @Date 2019/4/18-11:37
 */
@EnableZipkinServer
@SpringCloudApplication
public class AltacloudZipkinController {

    public static void main(String[] args) {
        SpringApplication.run(AltacloudZipkinController.class, args);
    }

    @Bean
    public MySQLStorage mySQLStorage(DataSource datasource) {
        return MySQLStorage.builder().datasource(datasource).executor(Runnable::run).build();
    }
}
