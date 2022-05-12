package com.lambda;

import java.util.Collections;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

public class WelcomeGateway implements RequestHandler<Object,GatewayResponse> {
	@Override
	public GatewayResponse handleRequest(Object input, Context context) {
		// TODO Auto-generated method stub
		String message="Welcome to gateway app";
		System.out.println(message);
		
		GatewayResponse response=new GatewayResponse(message,200,Collections.singletonMap("powered by", "PWC-US"));
		return response;
	}
}
