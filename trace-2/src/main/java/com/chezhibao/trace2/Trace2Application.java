package com.chezhibao.trace2;

import org.apache.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.sleuth.sampler.AlwaysSampler;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
@EnableDiscoveryClient
@SpringBootApplication
public class Trace2Application {

    private final Logger logger = Logger.getLogger(getClass());
    @Bean
    public AlwaysSampler defaultSampler(){
        return new AlwaysSampler();
    }
    @RequestMapping(value = "/trace-2",method = RequestMethod.GET)
    public String trace(HttpServletRequest request){
        logger.info("===call trace-2,TraceId={" + request.getHeader("X-B3-TraceId") + "},SpanId={" + request.getHeader("X-B3-SpanId") + "}===");
        return "Trace";
    }

    public static void main(String[] args) {
        SpringApplication.run(Trace2Application.class, args);
    }
}
