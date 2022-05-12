package com.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.AppDAO;
import com.model.Login;
import com.model.Registration;

@Service
public class Appservice {
	@Autowired
	private AppDAO appDAO;
	
	List<Registration> lst = new ArrayList<Registration>();
	
	public boolean loginValid(Login login) {
		
		for(Registration reg : lst)
		if(login.getUserName().equals(reg.getUsername()) && login.getPassword().equals(reg.getPassword())) {
			return true;
		}
		return false;		
	}
	
	public void addUser(Registration reg) {
		//lst.add(reg);
		appDAO.save(reg);
		System.out.println(lst);
	}
	
	public List<Registration> loadAll(){
		List<Registration> lst=(List<Registration>)appDAO.findAll();
		return lst;
	}
	/*public boolean findUser(String name) {
		for(Registration rs:lst) {
			if(rs.getUsername().equals(name)) {
				System.out.println(rs.getEmail());
				return true;
			}
		}
		return false;
	}*/
	public boolean findUser(int id) {
		Optional opt=appDAO.findById(id);
		if(opt.isPresent()) {
			return true;
		}
		return false;
		
	}
	public boolean deleteUser(int id) {
		Optional opt=appDAO.findById(id);
		if(opt.isPresent()) {
			appDAO.deleteById(id);
			return true;
		}
		return false;
		/*for(Registration rs:lst) {
		if(rs.getUsername().equals(name)) {
			lst.remove(rs);
			return true;
		}
	}*/
	}
	public boolean updateUser(Registration reg,int id) {
		/*int i=0;
		for(Registration rs:lst)
		{
			if(rs.getUsername().equals(name)) {
				lst.set(i,reg);
				return true;
		}
			i++;
	}
		return false;
	}*/
		Optional opt=appDAO.findById(id);
		if(opt.isPresent()) {
			appDAO.deleteById(id);
			appDAO.save(reg);
			return true;
		}
		return false;
	}
}
