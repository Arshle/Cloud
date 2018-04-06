/*
 * Copyright (C), 2018-2020,中间件开发工程师
 * FileName: ConsumerController.java
 * Author:   Arshle
 * Date:     2018年04月06日
 * Description:
 */
package com.chezhibao.feignconsumer.controller;

import com.chezhibao.feignconsumer.intf.HelloService;
import com.chezhibao.feignconsumer.intf.RefactorHelloService;
import com.chezhibao.helloserviceapi.entity.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 〈〉<br>
 * 〈〉
 *
 * @author Arshle
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本]（可选）
 */
@RestController
public class ConsumerController {

    @Resource
    HelloService helloService;

    @Resource
    RefactorHelloService refactorHelloService;

    @RequestMapping(value = "/feign-consumer",method = RequestMethod.GET)
    public String helloConsumer(){
        return helloService.hello();
    }

    @RequestMapping(value = "/feign-consumer2",method = RequestMethod.GET)
    public String helloConsumer2(){
        StringBuilder sb = new StringBuilder();
        sb.append(helloService.hello()).append("\n");
        sb.append(helloService.hello("DIDI")).append("\n");
        sb.append(helloService.hello("DIDI",30)).append("\n");
        sb.append(helloService.hello(new com.chezhibao.feignconsumer.entity.User("DIDI",30))).append("\n");
        return sb.toString();
    }

    @RequestMapping(value = "/feign-consumer3",method = RequestMethod.GET)
    public String helloConsumer3(){
        StringBuilder sb = new StringBuilder();
        sb.append(refactorHelloService.hello("MIMI")).append("\n");
        sb.append(refactorHelloService.hello("MIMI",20)).append("\n");
        sb.append(refactorHelloService.hello(new User("MIMI",20))).append("\n");
        return sb.toString();
    }
}
