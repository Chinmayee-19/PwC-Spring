package com.client;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.service.CalculatorService;

public class Client {
	public static void main(String[] args) {
		ConfigurableApplicationContext ctx= new AnnotationConfigApplicationContext(AppConfig.class);
		CalculatorService sc=(CalculatorService) ctx.getBean("service");
		System.out.println(sc.service(3456));
		ctx.close();
	}
}
