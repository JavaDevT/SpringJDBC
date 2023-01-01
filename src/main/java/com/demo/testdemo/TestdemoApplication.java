package com.demo.testdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.demo.testdemo")
public class TestdemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestdemoApplication.class, args);
	}

}
