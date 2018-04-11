/*
 * Copyright (C), 2018-2020,中间件开发工程师
 * FileName: RabbitConfig.java
 * Author:   Arshle
 * Date:     2018年04月12日
 * Description:
 */
package com.chezhibao.rabbitmq;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 〈〉<br>
 * 〈〉
 *
 * @author Arshle
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本]（可选）
 */
@Configuration
public class RabbitConfig {

    @Bean
    public Queue helloQueue(){
        return new Queue("hello");
    }
}
