/*
 * Copyright (C), 2018-2020,中间件开发工程师
 * FileName: HelloService.java
 * Author:   Arshle
 * Date:     2018年04月06日
 * Description:
 */
package com.chezhibao.helloserviceapi.api;

import com.chezhibao.helloserviceapi.entity.User;
import org.springframework.web.bind.annotation.*;

/**
 * 〈〉<br>
 * 〈〉
 *
 * @author Arshle
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本]（可选）
 */
@RequestMapping("/refactor")
public interface HelloService {

    @RequestMapping(value = "/hello4",method = RequestMethod.GET)
    String hello(@RequestParam("name") String name);

    @RequestMapping(value="/hello5",method = RequestMethod.GET)
    User hello(@RequestHeader("name") String name, @RequestHeader("age") Integer age);

    @RequestMapping(value = "/hello6",method = RequestMethod.POST)
    String hello(@RequestBody User user);
}
