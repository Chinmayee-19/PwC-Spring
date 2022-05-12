package com.example.pwcspring;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Aopadvice {
	
	/*@Before(value="execution(* com.example.pwcspring.GreetingsImpl.sayGreetings(..))")
	public void callBefore(){
		System.out.println("Calling Before");
	}*/
	
	@Around(value="execution(* com.example.pwcspring.GreetingsImpl.*(..))")
	public void callAround(ProceedingJoinPoint pj) throws Throwable{
		System.out.println("Calling before");
		pj.proceed();
		System.out.println("Calling After");
	}
	

}
