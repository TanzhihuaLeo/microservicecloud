package com.atguigu.myrule;

import com.netflix.loadbalancer.IRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: TanZhiHua
 * @Date: 2019/6/20 23:02
 */
@Configuration
public class MySelfRule {

    @Bean
    public IRule myRule() {
        // Ribbon默认是轮询，自定义为随机
//        return new RandomRule();

        return new MyRule();
    }

}
