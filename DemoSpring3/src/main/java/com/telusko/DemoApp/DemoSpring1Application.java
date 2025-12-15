package com.telusko.DemoApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoSpring1Application {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(DemoSpring1Application.class, args);
		Dev ashmita =context.getBean(Dev.class);
		ashmita.build();
	}

}
