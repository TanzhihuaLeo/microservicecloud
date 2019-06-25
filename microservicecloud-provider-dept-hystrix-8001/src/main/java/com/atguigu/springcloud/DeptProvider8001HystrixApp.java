package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Author: TanZhiHua
 * @Date: 2019/6/20 9:46
 * EnableEurekaClient 本服务启动后会自动注册进eureka服务中
 * EnableDiscoveryClient 服务发现
 * EnableCircuitBreaker  对hystrix熔断机制的支持
 */
@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
@EnableCircuitBreaker
public class DeptProvider8001HystrixApp {
    public static void main(String[] args) {
        SpringApplication.run(DeptProvider8001HystrixApp.class, args);
    }
}

