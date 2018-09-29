package com.groupon.controller;

import com.groupon.model.Goods;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

/**
 * Created by edward.rui on 2018/9/29.
 */
@Configuration
@RestController
@RequestMapping("/v1")
public class HelloController {
    private static final String template = "Hello, %s!";
    private final AtomicLong atomicLong = new AtomicLong();
    @Value("${config.name}")
    private String configName = "";

    @RequestMapping("/hello")
    public Goods greeting(@RequestParam(value = "name",defaultValue = "world") String name){
        return new Goods(atomicLong.incrementAndGet(),String.format(template,configName + name));
    }

}
