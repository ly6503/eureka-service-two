package com.example.eurekauserfeign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
//@ComponentScan(basePackages = "com.example.eurekauserfeign.client")
public class EurekaUserFeignApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaUserFeignApplication.class, args);
    }

}
