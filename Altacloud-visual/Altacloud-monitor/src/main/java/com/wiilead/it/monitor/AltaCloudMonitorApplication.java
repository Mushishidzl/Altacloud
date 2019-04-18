package com.wiilead.it.monitor;


import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @ClassName: AltaCloudMonitorApplication
 * @Description: 监控中心 基于springcloud-admin
 * @Author mushishi
 * @Date 2019/4/17-15:25
 */
@EnableAdminServer
@SpringBootApplication
public class AltaCloudMonitorApplication {


    /**
     *
     * @param args
     */
    public static void main(String [] args){
        SpringApplication.run(AltaCloudMonitorApplication.class,args);
    }

}
