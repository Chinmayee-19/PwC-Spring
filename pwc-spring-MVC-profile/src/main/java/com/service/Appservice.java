package com.service;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class Appservice {
	
	RestTemplate template=new RestTemplate();
	
	public String callApp() {
		String response=template.exchange("http://localhost:8090/mainapp/loadusers"
				,HttpMethod.GET,null,new ParameterizedTypeReference<String>(){
		}).getBody();
		return response;
	}
	public String callApp2() {
		String response=template.exchange("http://localhost:8060/mainapp/loadusers"
				,HttpMethod.GET,null,new ParameterizedTypeReference<String>(){
		}).getBody();
		return response;
		
	}
}
