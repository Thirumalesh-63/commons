package com.zapcom.common.model;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Booking")
public class Booking {

	@Id
	private int id;

	@DBRef
	private User user;

	@DBRef
	private Cruise cruise;

	private Date bookingDate;

	private String Payment;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Cruise getCruise() {
		return cruise;
	}

	public void setCruise(Cruise cruise) {
		this.cruise = cruise;
	}

	public Date getBookingDate() {
		return bookingDate;
	}

	public void setBookingDate(Date bookingDate) {
		this.bookingDate = bookingDate;
	}

	public String getPayment() {
		return Payment;
	}

	public void setPayment(String payment) {
		Payment = payment;
	}

	public Booking(int id, User user, Cruise cruise, Date bookingDate, String payment) {
		super();
		this.id = id;
		this.user = user;
		this.cruise = cruise;
		this.bookingDate = bookingDate;
		Payment = payment;
	}

	public Booking() {
		super();
		// TODO Auto-generated constructor stub
	}

}
