/*
 * Copyright (C), 2018-2020,中间件开发工程师
 * FileName: SinkReceiver.java
 * Author:   Arshle
 * Date:     2018年04月12日
 * Description:
 */
package com.chezhibao.stream;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;

/**
 * 〈〉<br>
 * 〈〉
 *
 * @author Arshle
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本]（可选）
 */
@EnableBinding(Sink.class)
public class SinkReceiver {

    private  static Logger logger = LoggerFactory.getLogger(SinkReceiver.class);

    @StreamListener(Sink.INPUT)
    public void receive(Object payload){
        System.out.println("Received:" + payload);
    }
}
