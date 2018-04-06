/*
 * Copyright (C), 2018-2020,中间件开发工程师
 * FileName: RefactorHelloService.java
 * Author:   Arshle
 * Date:     2018年04月06日
 * Description:
 */
package com.chezhibao.feignconsumer.intf;

import com.chezhibao.helloserviceapi.api.HelloService;
import org.springframework.cloud.netflix.feign.FeignClient;

/**
 * 〈〉<br>
 * 〈〉
 *
 * @author Arshle
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本]（可选）
 */
@FeignClient("hello-service")
public interface RefactorHelloService extends HelloService {
}
