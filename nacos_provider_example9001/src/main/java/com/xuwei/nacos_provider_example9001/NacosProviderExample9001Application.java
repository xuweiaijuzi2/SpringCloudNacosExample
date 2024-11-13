package com.xuwei.nacos_provider_example9001;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class NacosProviderExample9001Application {

    public static void main(String[] args) {
        SpringApplication.run(NacosProviderExample9001Application.class, args);
    }

}
