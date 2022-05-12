package com.lambda;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

public class WelcomeApp implements RequestHandler<Object,Object> {
		@Override
		public Object handleRequest(Object input,Context context) {
			System.out.println("Welcome to java lambda");
			return null;
		}
}
