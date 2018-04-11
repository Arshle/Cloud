/*
 * Copyright (C), 2018-2020,中间件开发工程师
 * FileName: Sender.java
 * Author:   Arshle
 * Date:     2018年04月12日
 * Description:
 */
package com.chezhibao.rabbitmq;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.Date;

/**
 * 〈〉<br>
 * 〈〉
 *
 * @author Arshle
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本]（可选）
 */
@Component
public class Sender {

    @Resource
    private AmqpTemplate amqpTemplate;

    public void send(){
        String context = "hello" + new Date();
        System.out.println("Sender:" + context);
        this.amqpTemplate.convertAndSend("jello",context);
    }
}
