package com.example.pwcspring;

import org.springframework.stereotype.Component;

@Component("gi")
public class GreetingsImpl implements Welcome{

	@Override
	public void sayGreetings(String name) {
		System.out.println(name+" Welcome to Spring AOP ");
		
	}
	public void sayHello(String name,String city) {
		System.out.println(name+" Hello "+city);
	}

}
