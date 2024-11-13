package com.xuwei.nacos_provider_example9001.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: SpringCloudNacosExample
 * @Date: 2024/11/13 23:04
 * @Author: Mr.Xu
 * @Description:
 */
@RestController
public class NacosProviderController {

    @GetMapping("/hello")
    public String hello(){
        System.out.println("---------Nacos Provider is running-----------");
        return "this is nacosProvider back";
    }
}
