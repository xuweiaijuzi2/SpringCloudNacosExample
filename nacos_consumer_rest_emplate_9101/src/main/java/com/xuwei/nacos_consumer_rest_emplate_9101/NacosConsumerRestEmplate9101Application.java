package com.xuwei.nacos_consumer_rest_emplate_9101;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class NacosConsumerRestEmplate9101Application {

    public static void main(String[] args) {
        SpringApplication.run(NacosConsumerRestEmplate9101Application.class, args);
    }

}
