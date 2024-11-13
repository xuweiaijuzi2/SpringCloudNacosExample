package com.xuwei.nacosconsumeropenfeign9102.config;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @program: SpringCloudNacosExample
 * @Date: 2024/11/13 23:31
 * @Author: Mr.Xu
 * @Description:
 */
@FeignClient(name = "nacos-provider")
public interface ProviderService {

    @GetMapping("/hello")
    public String hello();
}
