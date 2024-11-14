package com.xuwei.nacos_config_example_9200.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @program: SpringCloudNacosExample
 * @Date: 2024/11/14 10:24
 * @Author: Mr.Xu
 * @Description:
 */
@FeignClient(name = "nacos-provider")
public interface ProviderService {

    @GetMapping("/hello")
    @LoadBalanced
    public String hello();
}
