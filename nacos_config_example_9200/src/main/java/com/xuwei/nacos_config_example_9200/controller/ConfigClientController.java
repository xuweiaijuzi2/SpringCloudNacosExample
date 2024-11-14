package com.xuwei.nacos_config_example_9200.controller;

import com.xuwei.nacos_config_example_9200.config.ProviderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: SpringCloudNacosExample
 * @Date: 2024/11/14 10:26
 * @Author: Mr.Xu
 * @Description:
 */
@RestController
@RefreshScope // 动态刷新配置
public class ConfigClientController {


    @Autowired
    private ProviderService providerService;

    @Value("${config.info}")
    private String configInfo;

    @GetMapping("/hello")
    public String hello(){
        System.out.println("------nacos config is running------");
        System.out.println(configInfo);
        return providerService.hello();
    }
}
