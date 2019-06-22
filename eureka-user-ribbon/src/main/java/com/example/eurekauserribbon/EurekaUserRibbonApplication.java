package com.example.eurekauserribbon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableEurekaServer
@EnableHystrix
@EnableCircuitBreaker
public class EurekaUserRibbonApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaUserRibbonApplication.class, args);
    }

    @Bean
    @LoadBalanced
        //开启客户端负载均衡
    RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
