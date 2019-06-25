package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * @Author: TanZhiHua
 * @Date: 2019/6/21 18:03
 */
@SpringBootApplication
@EnableHystrixDashboard
public class DeptConsumerDashBoardApp {
    public static void main(String[] args) {
        SpringApplication.run(DeptConsumerDashBoardApp.class, args);
    }
}
