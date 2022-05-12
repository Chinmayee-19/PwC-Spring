package com.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

public class SavingsAccount implements InterestCalculator {
	@Value("5")
	private int duration;
	@Value("5.5")
	private double roi;
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	public double getRoi() {
		return roi;
	}
	public void setRoi(double roi) {
		this.roi = roi;
	}
	@Override
	public double calculate(double amount) {
		// TODO Auto-generated method stub
		return amount*roi / duration;
	}
	public SavingsAccount() {
		System.out.println("SA Initialized");
	}

}
