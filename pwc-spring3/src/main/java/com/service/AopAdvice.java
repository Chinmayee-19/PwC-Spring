package com.service;


import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AopAdvice {
	@Around(value="execution(* com.service.CalculatorService.service(..))")
	public double callAround(ProceedingJoinPoint pj) throws Throwable {
		System.out.println("Calling around");
		return(double) (pj.proceed());
		
	}
		
	

}
