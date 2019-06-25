package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * @Author: TanZhiHua
 * @Date: 2019/6/20 10:49
 * EnableEurekaClient 本服务启动后会自动注册进eureka服务中
 * EnableFeignClients 自动启用feign客户端
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages= {"com.atguigu.springcloud"})
public class DeptConsumer80FeignApp {
    public static void main(String[] args) {
        SpringApplication.run(DeptConsumer80FeignApp.class, args);
    }
}
