/*
 * Copyright (C), 2018-2020,中间件开发工程师
 * FileName: HelloController.java
 * Author:   Arshle
 * Date:     2018年04月04日
 * Description:
 */
package com.chezhibao.cloudstart.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
