package com.dto;

public class BookingStatus {
	private Tablebook tablebooking;
	private String bookingstatus;
	private String restaurantmessage;
	public Tablebook getTablebooking() {
		return tablebooking;
	}
	public void setTablebooking(Tablebook tablebooking) {
		this.tablebooking = tablebooking;
	}
	public String getBookingstatus() {
		return bookingstatus;
	}
	public void setBookingstatus(String bookingstatus) {
		this.bookingstatus = bookingstatus;
	}
	public String getRestaurantmessage() {
		return restaurantmessage;
	}
	public void setRestaurantmessage(String restaurantmessage) {
		this.restaurantmessage = restaurantmessage;
	}
	public BookingStatus(Tablebook tablebooking, String bookingstatus, String restaurantmessage) {
		super();
		this.tablebooking = tablebooking;
		this.bookingstatus = bookingstatus;
		this.restaurantmessage = restaurantmessage;
	}
	public BookingStatus() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "BookingStatus [tablebooking=" + tablebooking + ", bookingstatus=" + bookingstatus
				+ ", restaurantmessage=" + restaurantmessage + "]";
	}
	
}
