package com.client.eureka;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by sulong on 2018/11/13.
 */
@RestController
public class ProductsController {

    @GetMapping("/products")
    public String product() {
        return "hello,this is products";
    }
}



