package com.dao;

import org.springframework.stereotype.Repository;

import com.model.Employee;
import com.model.Employees;

@Repository
public class EmployeeDAO {
	private static Employees list=new Employees();
	static {
		list.getEmpList().add(new Employee(1,"admin","manager","admin@mail.com"));
		list.getEmpList().add(new Employee(2,"QA","Testing","QA@mail.com"));
	}
	public Employees getAllEmplist() {
		return list;
	}
	public void addEmployee(Employee employee) {
		list.getEmpList().add(employee);
	}
	
}
