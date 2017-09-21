package com.lanze.springboot.hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author muyk@upay360.com
 * @date 2017年9月20日 下午6:21:08
 * @description 
 */
@RestController
@EnableAutoConfiguration
public class Example {
	
	@RequestMapping("/")
    String home() {
        return "Hello World!";
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(Example.class, args);
    }
}
