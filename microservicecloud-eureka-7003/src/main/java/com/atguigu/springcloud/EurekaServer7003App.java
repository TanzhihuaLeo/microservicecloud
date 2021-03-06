package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @Author: TanZhiHua
 * @Date: 2019/6/20 14:34
 * EurekaServer服务器端启动类,接受其它微服务注册进来
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaServer7003App {
    public static void main(String[] args) {
        SpringApplication.run(EurekaServer7003App.class, args);
    }
}

