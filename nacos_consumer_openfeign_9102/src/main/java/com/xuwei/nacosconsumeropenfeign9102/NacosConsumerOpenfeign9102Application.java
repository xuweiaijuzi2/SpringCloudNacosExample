package com.xuwei.nacosconsumeropenfeign9102;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients(basePackages = "com.xuwei.nacosconsumeropenfeign9102.config")
@EnableDiscoveryClient
@SpringBootApplication
public class NacosConsumerOpenfeign9102Application {

    public static void main(String[] args) {
        SpringApplication.run(NacosConsumerOpenfeign9102Application.class, args);
    }

}
