package com.lanze.springboot.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author muyk@upay360.com
 * @date 2017年9月21日 上午11:59:53
 * @description 
 */
//@Configuration
//@EnableAutoConfiguration
//@ComponentScan
@SpringBootApplication // same as @Configuration @EnableAutoConfiguration @ComponentScan
public class MyApplication {
	public static void main(String[] args) {
		//System.setProperty("spring.devtools.restart.enabled", "false");
		SpringApplication.run(MyApplication.class, args);
	}
}
