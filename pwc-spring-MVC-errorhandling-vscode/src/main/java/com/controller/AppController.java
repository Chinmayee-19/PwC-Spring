package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import com.dao.EmployeeDAO;
import com.model.Employee;
import com.model.Employees;

import io.swagger.annotations.ApiOperation;

@RestController
@CrossOrigin("http://localhost:3000")
public class AppController {
	@Autowired
	private EmployeeDAO employeeDAO;
	
	@GetMapping(value="/loadall",produces="application/json")
	@ApiOperation(value="load all users from backend",
	notes="basically loads stored data from my sql database",response=Employee.class)
	public Employees loadAll() {
		return employeeDAO.getAllEmplist();
	}
	@PostMapping("/adduser")
	public ResponseEntity<Object> addUser(@RequestBody Employee emp){
		int id=employeeDAO.getAllEmplist().getEmpList().size()+1;
		emp.setEmpId(id);
		employeeDAO.addEmployee(emp);
		return ResponseEntity.ok("Emp added");
		
	}
}
