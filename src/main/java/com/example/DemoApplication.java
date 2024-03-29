package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan(basePackages = {"config","com","controllers","model"})
public class DemoApplication {
	


	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
}
