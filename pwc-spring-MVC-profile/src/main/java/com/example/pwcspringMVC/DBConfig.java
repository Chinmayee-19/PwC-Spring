package com.example.pwcspringMVC;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@ConfigurationProperties("spring.datasource")
public class DBConfig {
	private String driverClassName;
	private String url;
	private String username;
	private String password;
	public String getDriverClassName() {
		return driverClassName;
	}
	public void setDriverClassName(String driverClassName) {
		this.driverClassName = driverClassName;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Bean
	@Profile("dev")
	public String devDBLoad() {
		System.out.println("DB with dev profile loaded");
		System.out.println(driverClassName);
		System.out.println(url);
		return "DB dev environment loaded";
	}
	@Bean
	@Profile("prod")
	public String prodDBLoad() {
		System.out.println("DB with prod profile loaded");
		System.out.println(driverClassName);
		System.out.println(url);
		return "DB prod environment loaded";
	}
	@Bean
	@Profile("test")
	public String testDBLoad() {
		System.out.println("DB with test profile loaded");
		System.out.println(driverClassName);
		System.out.println(url);
		return "DB test environment loaded";
	}

}
