package com.example.pwcspring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class EmployeeApp {
	@Autowired
	private EmployeeDao dao;
	@RequestMapping("/")
	public String addEmployee() {
		Employee emp=new Employee("Chinmayee","c@mail.com","London");
		dao.insertEmployee(emp);
		return "employee added";
	}

}
