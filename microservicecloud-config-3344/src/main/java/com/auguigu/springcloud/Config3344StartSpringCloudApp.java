package com.auguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @Author: TanZhiHua
 * @Date: 2019/6/25 14:45
 */
@SpringBootApplication
@EnableConfigServer
public class Config3344StartSpringCloudApp {
    public static void main(String[] args) {
        SpringApplication.run(Config3344StartSpringCloudApp.class, args);
    }
}
