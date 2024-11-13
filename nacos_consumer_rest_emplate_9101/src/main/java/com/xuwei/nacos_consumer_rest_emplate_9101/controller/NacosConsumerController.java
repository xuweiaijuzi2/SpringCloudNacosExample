package com.xuwei.nacos_consumer_rest_emplate_9101.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @program: SpringCloudNacosExample
 * @Date: 2024/11/13 23:18
 * @Author: Mr.Xu
 * @Description:
 */
@RestController
public class NacosConsumerController {

    @Autowired
    private RestTemplate restTemplate;

    @Value("${service-url.nacos-user-service}")
    private String serverURL;

    @GetMapping("/hello")
    public String hello(){
        System.out.println("-------nacos consumer is running-------");
        return restTemplate.getForObject(serverURL + "/hello",String.class);
    }
}
