package com.client.eureka;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by sulong on 2018/11/14.
 */
// 该标签用来声明这个client是用来访问product的
//    因为order 也是一个服务端 所以在这里开一个feignclient 的接口 访问 product
    //注册中心product服务的Application
@FeignClient("product")
public interface ProductClient {
    @GetMapping("/products")
    String getProgetct();




}
