package com.xuwei.nacos_consumer_rest_emplate_9101.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @program: SpringCloudNacosExample
 * @Date: 2024/11/13 23:16
 * @Author: Mr.Xu
 * @Description:
 */
@Configuration
public class RestTemplateConfig {

    @Bean
    @LoadBalanced
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
