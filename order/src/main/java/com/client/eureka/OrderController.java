//package com.client.eureka;
//
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.cloud.client.ServiceInstance;
//import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RestController;
//import org.springframework.web.client.RestTemplate;
//import static java.lang.String.format;
//
//
///**
// * Created by sulong on 2018/11/13.
// */
//@RestController
//@Slf4j
//public class OrderController {
//    @Autowired
//    private LoadBalancerClient client;
//
//    @Autowired
//    private ProductClient productClient;
//    @GetMapping("/get")
//    public String getProducts() {
//        String str = productClient.getProgetct();
//
//        return str;
//    }
//
//////    @Autowired
////    @GetMapping("/get")
////    public String getProduct(){
////        RestTemplate restTemplate=new RestTemplate();
////
////        ServiceInstance instance = client.choose("PRODUCT");
////        String url= format("http://%s:%s",instance.getHost(),instance.getPort()) +"/products";
////        String re_type1=restTemplate.getForObject(url,String.class);
////        System.out.println(re_type1);
////        return "";
////    }
//
//}
