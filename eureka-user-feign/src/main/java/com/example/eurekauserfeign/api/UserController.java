package com.example.eurekauserfeign.api;

import com.example.eurekauserfeign.client.UserFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: liuyin
 * @Date: 2019/5/22 13:04
 * @Description:
 */
@RestController
public class UserController {

    @Autowired
    private UserFeignClient userFeignClient;

    @GetMapping("/demo")
    public String demo() {
        String users = this.userFeignClient.hello();
        return users;
    }
}
