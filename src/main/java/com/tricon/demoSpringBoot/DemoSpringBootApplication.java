package com.tricon.demoSpringBoot;

import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoSpringBootApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(DemoSpringBootApplication.class, args);
		String[] beans = ctx.getBeanDefinitionNames();
		for(String bean : beans) {
			System.out.println(bean);
		}
	}

}
