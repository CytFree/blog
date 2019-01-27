package com.cyt.blog.web.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    private static final Logger LOGGER = LoggerFactory.getLogger(HelloController.class);

    @GetMapping("/hello/{userName}.html")
    public String hello(@PathVariable String userName) {
        LOGGER.info(userName + "请求了hello方法");
        return "Hello," + userName;
    }
}
