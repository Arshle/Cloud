/*
 * Copyright (C), 2018-2020,中间件开发工程师
 * FileName: Receiver.java
 * Author:   Arshle
 * Date:     2018年04月12日
 * Description:
 */
package com.chezhibao.rabbitmq;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * 〈〉<br>
 * 〈〉
 *
 * @author Arshle
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本]（可选）
 */
@Component
@RabbitListener(queues = "hello")
public class Receiver {

    @RabbitHandler
    public void process(String message){
        System.out.println("Receiver:" + message);
    }
}
