package com.example.eurekaconfigcenter;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RefreshScope//动态刷新
public class EurekaConfigCenterApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaConfigCenterApplication.class, args);
    }

    @Value("${from}")
    private String from;


    @RequestMapping(value = "from")
    public String getFrom() {
        return this.from;
    }
}
