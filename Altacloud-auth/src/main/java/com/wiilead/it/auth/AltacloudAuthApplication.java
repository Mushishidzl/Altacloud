package com.wiilead.it.auth;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;

/**
 * @ClassName: AltacloudAuthController
 * @Description: 认证中心
 * @Author mushishi
 * @Date 2019/4/18-15:19
 */
@SpringCloudApplication
public class AltacloudAuthApplication {

    public static void main(String [] args){
        SpringApplication.run(AltacloudAuthApplication.class,args);
    }
}
