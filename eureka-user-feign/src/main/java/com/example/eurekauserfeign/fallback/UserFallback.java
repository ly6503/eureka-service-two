package com.example.eurekauserfeign.fallback;

import com.example.eurekauserfeign.client.UserFeignClient;
import org.springframework.stereotype.Component;

/**
 * @Author: liuyin
 * @Date: 2019/5/22 13:01
 * @Description:
 */
@Component
public class UserFallback implements UserFeignClient {

    @Override
    public String hello() {
        return "调用失败";
    }
}
