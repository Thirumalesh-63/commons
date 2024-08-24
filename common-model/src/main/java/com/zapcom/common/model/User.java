package com.zapcom.common.model;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "users")
public class User {

	@Id
	private int id;
	
	private String name;
	
	private String role;
	
	private String email;
	
	private String password;
	
	private String phonenumber;
	
	private String address;
	
	@DBRef
	private List<Booking> booking;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPhonenumber() {
		return phonenumber;
	}

	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public User(int id, String name, String role, String email, String password, String phonenumber, String address) {
		super();
		this.id = id;
		this.name = name;
		this.role = role;
		this.email = email;
		this.password = password;
		this.phonenumber = phonenumber;
		this.address = address;
	}

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
