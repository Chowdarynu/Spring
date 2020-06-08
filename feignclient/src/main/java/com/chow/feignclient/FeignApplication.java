package com.chow.feignclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients(basePackages = {"com.chow.feignclient"})
public class FeignApplication {
 
    public static void main(String[] args) {
        SpringApplication.run(FeignApplication.class, args);
    }
}
