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
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.model.Login;
import com.model.Registration;
import com.service.Appservice;

@RestController
@RequestMapping("/mainapp")
public class AppController {
	
	@Autowired
	private Appservice service;
	@GetMapping("/loadusers")
	public List <Registration> sayHello(@RequestHeader(name="X-COM-PERSIST",required=true)String header,
			@RequestHeader(name="X-COM-LOCATION",defaultValue="ASIA")String loc){
		List<Registration> lst=service.loadAll();
		return lst;
	}
	
	/*@RequestMapping(value="/welcome",method=RequestMethod.GET)

	public String sayHello() {
		return "Welcome to Spring MVC";
	}*/
	
	//@RequestMapping(value="/login",method=RequestMethod.POST)
	@PostMapping("/login")
	public String login(@RequestBody Login login) {
		if(service.loginValid(login)) {
			return "Login Success";
		}
		return "Login Failure";
	}
	
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
	public String findUser(@PathVariable("uid")int uid) {
		if(service.findUser(uid)) {
			return uid+" found";
		}
		return uid+" not found";
	}
	@DeleteMapping("/deleteuser/{uid}")
	public String deleteUser(@PathVariable("uid")int uid) {
		if(service.deleteUser(uid)) {
			return uid+" deleted";
		}
		return uid+" not deleted";
	}
	@PutMapping("/updateuser/{uid}")
	public String updateUser(@RequestBody Registration reg, @PathVariable("uid") int uid) {
		if(service.updateUser(reg, uid))
			return uid+" updated";
		else 
			return uid+" not updated";
		
	}
}

