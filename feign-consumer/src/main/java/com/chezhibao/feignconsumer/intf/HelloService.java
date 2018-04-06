/*
 * Copyright (C), 2018-2020,中间件开发工程师
 * FileName: HelloService.java
 * Author:   Arshle
 * Date:     2018年04月06日
 * Description:
 */
package com.chezhibao.feignconsumer.intf;

import com.chezhibao.feignconsumer.entity.User;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.*;

/**
 * 〈〉<br>
 * 〈〉
 *
 * @author Arshle
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本]（可选）
 */
@FeignClient("hello-service")
public interface HelloService {

    @RequestMapping("/hello")
    String hello();

    @RequestMapping(value = "/hello1",method = RequestMethod.GET)
    String hello(@RequestParam("name") String name);

    @RequestMapping(value="/hello2",method = RequestMethod.GET)
    User hello(@RequestHeader("name") String name,@RequestHeader("age") Integer age);

    @RequestMapping(value = "/hello3",method = RequestMethod.POST)
    String hello(@RequestBody User user);
}
