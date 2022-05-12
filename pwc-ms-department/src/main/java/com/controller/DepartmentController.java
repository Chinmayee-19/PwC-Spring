package com.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.model.Department;

import io.swagger.annotations.ApiOperation;

@RestController
public class DepartmentController {
	
	private static Map<String, List<Department>> deptDB = new HashMap<String,List<Department>>();
	static List<Department> lst = new ArrayList<Department>();
	
	static {
		deptDB = new HashMap<String,List<Department>>();
		
		Department dept = new Department("testing","naman");
		lst.add(dept);
		dept = new Department("development","ishaan");
		lst.add(dept);
		deptDB.put("technical", lst);
		
		lst = new ArrayList<Department>();
		dept = new Department("hr","mayank");
		lst.add(dept);
		dept = new Department("finance","akhil");
		lst.add(dept);
		deptDB.put("consulting", lst);
		
	}
	
	@GetMapping("/loaddept/{department}")
	@ApiOperation(value="to load the specific department from backend",
	notes="basically loads the stored data from mysql database",response=Department.class)
	public List<Department> loaddept(@PathVariable("department") String department){
		List<Department> deptlist = deptDB.get(department);
		
		if(deptlist == null) {
			deptlist = new ArrayList<Department>();
			Department dept = new Department("NA","NA");
			deptlist.add(dept);
		}
		
		return deptlist;
		
	}
	@GetMapping("/loaddept/")
	@ApiOperation(value="to load the department from backend",
	notes="basically loads the stored data from mysql database",response=Department.class)
	public List<Department> loaddept(){
		return lst;
		
	}

}