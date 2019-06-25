package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @Author: TanZhiHua
 * @Date: 2019/6/25 16:01
 * EurekaServer服务器端启动类,接受其它微服务注册进来
 */
@SpringBootApplication
@EnableEurekaServer
public class ConfigGitEurekaServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(ConfigGitEurekaServerApplication.class, args);
    }
}
