/*
 * Copyright (C), 2018-2020,中间件开发工程师
 * FileName: ConsumerController.java
 * Author:   Arshle
 * Date:     2018年04月05日
 * Description:
 */
package com.chezhibao.ribbonconsumer.controller;

import com.chezhibao.ribbonconsumer.service.HelloService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

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
    private HelloService helloService;

    @RequestMapping("/ribbon-consumer")
    public String helloConsumer(){
        return helloService.helloService();
    }
}
