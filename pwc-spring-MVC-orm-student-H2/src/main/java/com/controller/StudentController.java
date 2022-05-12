package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.model.Login;
import com.model.Registration;
import com.service.Studentservice;

@RestController
@RequestMapping("/mainapp")
public class StudentController {
	
	@Autowired
	private Studentservice service;
	@GetMapping("/loadusers")
	public List <Registration> sayHello(){
		List<Registration> lst=service.loadAll();
		return lst;
	}
	
	/*@PostMapping("/login")
	public String login(@RequestBody Login login) {
		if(service.loginValid(login)) {
			return "Login Success";
		}
		return "Login Failure";
	}*/
	
	//@RequestMapping(value="/registration",method=RequestMethod.GET)
	@PostMapping("/registration")
	public String sayRegist() {
		return "Welcome to Registration";
	}
	
	//@RequestMapping(value="/register",method = RequestMethod.POST)
	@PostMapping("/register")
	public String register(@RequestBody Registration reg) {
		service.addUser(reg);
		return "Registrartion Done";
	}
	@GetMapping("/finduser/{uid}")
	public String findUser(@PathVariable("uid")int id) {
		if(service.findUser(id)) {
			return id+" found";
		}
		return id+" not found";
	}
	@DeleteMapping("/deleteuser/{uid}")
	public String deleteUser(@PathVariable("uid")int id) {
		if(service.deleteUser(id)) {
			return id+" deleted";
		}
		return id+" not deleted";
	}
	@PutMapping("/updateuser/{uid}")
	public String updateUser(@RequestBody Registration reg, @PathVariable("uid") int id) {
		if(service.updateUser(reg, id))
			return id+" updated";
		else 
			return id+" not updated";
		
	}
}

