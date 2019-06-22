package com.example.eurekauserfeign.client;

/**
 * @Author: liuyin
 * @Date: 2019/5/22 12:58
 * @Description:
 */

import com.example.eurekauserfeign.fallback.UserFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * 标明feign调用的微服务名称
 */
//通过@ FeignClient（“服务名”），来指定调用哪个服务。
// 比如在代码中调用了service-hi服务的“/hi”接口，还可以使用url参数指定一个URL
// fallback  出现错误回调类
@FeignClient(name = "service-user", fallback = UserFallback.class)
public interface UserFeignClient {

    @GetMapping("/hello")
    String hello();
}
