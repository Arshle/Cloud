/*
 * Copyright (C), 2018-2020,中间件开发工程师
 * FileName: HelloController.java
 * Author:   Arshle
 * Date:     2018年04月04日
 * Description:
 */
package com.chezhibao.cloudstart.controller;

import com.chezhibao.cloudstart.entity.User;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * 〈〉<br>
 * 〈〉
 *
 * @author Arshle
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本]（可选）
 */
@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String index(){
        return "Hello World";
    }

    @RequestMapping(value = "/hello1",method = RequestMethod.GET)
    public String hello(@RequestParam String name){
        return "Hello " + name;
    }

    @RequestMapping(value = "/hello2",method = RequestMethod.GET)
    public User hello(@RequestHeader String name,@RequestHeader Integer age){
        return new User(name,age);
    }

    @RequestMapping(value = "/hello3",method = RequestMethod.POST)
    public String hello(@RequestBody User user){
        return "Hello " + user.getName() + ", " + user.getAge();
    }
}
