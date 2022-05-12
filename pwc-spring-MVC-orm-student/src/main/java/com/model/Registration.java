package com.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="student1_spring_reg")
public class Registration {
	//@Id
	/*@GeneratedValue
	private int uId;
	public int getuId() {
		return uId;
	}
	public void setuId(int uId) {
		this.uId = uId;
	}
	*/
	@Id
	@GeneratedValue
	private int id;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	private String stuname;
	private String subject;
	private int marks;
	public String getStuname() {
		return stuname;
	}
	public void setStuname(String stuname) {
		this.stuname = stuname;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public Registration(String stuname, String subject, int marks) {
		super();
		this.stuname = stuname;
		this.subject = subject;
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Registration [stuname=" + stuname + ", subject=" + subject + ", marks=" + marks + "]";
	}
	public Registration() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
