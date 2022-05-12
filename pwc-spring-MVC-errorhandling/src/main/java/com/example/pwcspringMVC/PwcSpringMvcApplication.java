package com.example.pwcspringMVC;

import java.util.Collections;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2; 

@SpringBootApplication 
@ComponentScan("com")
@EnableSwagger2
public class PwcSpringMvcApplication{

    public static void main(String[] args) {
        SpringApplication.run(PwcSpringMvcApplication.class, args);
    }
    
    @Bean
    public Docket swaggerConfiguration() {
    	return new Docket(DocumentationType.SWAGGER_2)
    			.select()
    			.apis(RequestHandlerSelectors.basePackage("com"))
    			.build()
    	.apiInfo(apiDetails());
    }
    private ApiInfo apiDetails() {
    	return new ApiInfo("User Application",
    			"Sample crud app for Pwc india",
    			"1.0",
    			"Free to use",
    			new springfox.documentation.service.Contact("Chinmayee", "http://www.abc.com", "abc@gmail.com"), 
    			"Api license",
    			"http://www.abc.com",
    			Collections.emptyList());
    }
}
