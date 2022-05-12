package com.lambda;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

public class EmployeeLambdaGateway implements RequestHandler<Object, EmployeeGateWay> {

	@Override
	public EmployeeGateWay handleRequest(Object input, Context context) {
		EmployeeGateWay emp = new EmployeeGateWay(101,"Yash Chauhan","yash@mail.com","Meerut");
//		System.out.println("Employee Details:");
//		System.out.println(emp);
		return emp;
	}

}