package com.example.eurekaserviceuser.web;


import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: liuyin
 * @Date: 2019/5/22 10:26
 * @Description:
 */
@Log
@RestController
public class UserController {

    @Value("${server.port}")
    String serverPort;

    @GetMapping("/hello")
    public String ListUsers() throws InterruptedException {
        String str = "hello word!";
        log.info("/hello, host:" + serverPort);
        return "服务器端口号：   " + serverPort + "   |   信息：   " + str;
    }
}
