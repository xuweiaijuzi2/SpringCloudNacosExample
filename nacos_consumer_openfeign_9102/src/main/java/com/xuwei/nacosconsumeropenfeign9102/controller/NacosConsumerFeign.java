package com.xuwei.nacosconsumeropenfeign9102.controller;

import com.xuwei.nacosconsumeropenfeign9102.config.ProviderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: SpringCloudNacosExample
 * @Date: 2024/11/13 23:34
 * @Author: Mr.Xu
 * @Description:
 */
@RestController
public class NacosConsumerFeign {

    @Autowired
    private ProviderService providerService;

    @GetMapping("/hello")
    public String hello(){
        System.out.println("------nacos consumer feign is running------");
        return providerService.hello();
    }
}
