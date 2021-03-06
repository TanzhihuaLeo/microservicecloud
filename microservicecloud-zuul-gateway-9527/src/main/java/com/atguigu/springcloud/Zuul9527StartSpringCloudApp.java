package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @Author: TanZhiHua
 * @Date: 2019/6/25 11:05
 * EnableZuulProxy 启动Zuul
 */
@SpringBootApplication
@EnableZuulProxy
public class Zuul9527StartSpringCloudApp {
    public static void main(String[] args) {
        SpringApplication.run(Zuul9527StartSpringCloudApp.class, args);
    }
}
