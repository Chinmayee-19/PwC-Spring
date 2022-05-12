package com.example.pwcspringMVC;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@ConfigurationProperties("spring.user")
public class UserConfig {
	private String name;
	private String email;
	private String city;
	private int pincode;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	@Bean
	@Profile("manager")
	public String managerDBLoad() {
		System.out.println("DB with manager profile loaded");
		System.out.println(name);
		System.out.println(email);
		System.out.println(city);
		System.out.println(pincode);
		return "DB manager environment loaded";
	}
	@Bean
	@Profile("qa")
	public String qaDBLoad() {
		System.out.println("DB with qa profile loaded");
		System.out.println(name);
		System.out.println(email);
		System.out.println(city);
		System.out.println(pincode);
		return "DB qa environment loaded";
	}@Bean
	@Profile("fin")
	public String finDBLoad() {
		System.out.println("DB with fin profile loaded");
		System.out.println(name);
		System.out.println(email);
		System.out.println(city);
		System.out.println(pincode);
		return "DB fin environment loaded";
	}

}
