package com.dto;

public class Tablebook {
	private String bookID;
	private int noofpax;
	private String Cusine;
	private int starrating;
	public String getBookID() {
		return bookID;
	}
	public void setBookID(String bookID) {
		this.bookID = bookID;
	}
	public int getNoofpax() {
		return noofpax;
	}
	public void setNoofpax(int noofpax) {
		this.noofpax = noofpax;
	}
	public String getCusine() {
		return Cusine;
	}
	public void setCusine(String cusine) {
		Cusine = cusine;
	}
	public int getStarrating() {
		return starrating;
	}
	public void setStarrating(int starrating) {
		this.starrating = starrating;
	}
	public Tablebook(String bookID, int noofpax, String cusine, int starrating) {
		super();
		this.bookID = bookID;
		this.noofpax = noofpax;
		Cusine = cusine;
		this.starrating = starrating;
	}
	public Tablebook() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Order [bookID=" + bookID + ", noofpax=" + noofpax + ", Cusine=" + Cusine + ", starrating=" + starrating
				+ "]";
	}
	
	
	
}
