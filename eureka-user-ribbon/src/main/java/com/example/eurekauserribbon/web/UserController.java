package com.example.eurekauserribbon.web;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @Author: liuyin
 * @Date: 2019/5/22 11:09
 * @Description:
 */
@RestController
@Log
public class UserController {

    @Value("${server.port}")
    private String port;

    @Autowired
    RestTemplate restTemplate;

    @GetMapping("/demo")
    @HystrixCommand(fallbackMethod = "demoFallback")
    public String ListUsersByRibbon() {

        long start = System.currentTimeMillis();
        String result = this.restTemplate.getForObject("http://service-user/hello", String.class);
        long end = System.currentTimeMillis();
        log.info("Spend Time ：" + (end - start));
        return result;
    }

    public String demoFallback() {
        return "异常端口: " + port;
    }
}
