package com.atguigu.springcloud.cfgbeans;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RetryRule;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @Author: TanZhiHua
 * @Date: 2019/6/20 9:26
 * boot  --> spring   applicationContext.xml      @Configuration 配置类   ConfigBean = applicationContext.xml
 */
@Configuration
public class ConfigBean {

    /**
     * 使用restTemplate访问restful接口非常的简单粗暴无脑。
     * (url, requestMap, ResponseBean.class)这三个参数分别代表
     * REST请求地址、请求参数、HTTP响应转换被转换成的对象类型。
     * LoadBalanced 开启Ribbon客户端负载均衡
     *
     * @return
     */
    @Bean
    @LoadBalanced
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }

    /**
     * RoundRobinRule 轮询算法
     * RandomRule 随机算法
     * RetryRule 先按照RoundRobinRule的策略获取服务，如果获取服务失败则在指定时间内会进行重试，获取可用的服务
     *
     * @return
     */
    /*@Bean
    public IRule MyRule() {
        return new RetryRule();
    }*/

}
