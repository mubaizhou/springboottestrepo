package com.lanze.springboot.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author muyk@upay360.com
 * @date 2017年9月19日 下午4:25:17
 * @description 
 */
@RestController
public class HelloController {
	@RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }
}
