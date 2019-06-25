package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Author: TanZhiHua
 * @Date: 2019/6/20 9:46
 * EnableEurekaClient 本服务启动后会自动注册进eureka服务中
 * EnableDiscoveryClient 服务发现
 */
@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
public class DeptProvider8003App {
    public static void main(String[] args) {
        SpringApplication.run(DeptProvider8003App.class, args);
    }
}

