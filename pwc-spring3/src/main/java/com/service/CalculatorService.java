package com.service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.model.InterestCalculator;


public class CalculatorService {
	
	public InterestCalculator ic;
	public CalculatorService(InterestCalculator ic) {
		super();
		this.ic = ic;
	}
	public InterestCalculator getIc() {
		return ic;
	}

	public void setIc(InterestCalculator ic) {
		this.ic = ic;
	}
	public double service(double amount) {
		return(ic.calculate(amount));
	}
	public CalculatorService() {
		System.out.println("Service initalized");
	}
	/*@PostConstruct
	public void callInit() {
		System.out.println("init called");
	}
	@PreDestroy
	public void callDestroy() {
		System.out.println("Destroy called");
	}*/
	

}
