package com.zapcom.common.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "cruiseline")
public class Cruiseline {
	
	@Id
	private int id;
	
	private String name;
	
	private String headquarters;
	
	private String contactnumber;
	

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

	public String getHeadquarters() {
		return headquarters;
	}

	public void setHeadquarters(String headquarters) {
		this.headquarters = headquarters;
	}

	public String getContactnumber() {
		return contactnumber;
	}

	public void setContactnumber(String contactnumber) {
		this.contactnumber = contactnumber;
	}

	public Cruiseline(int id, String name, String headquarters, String contactnumber) {
		super();
		this.id = id;
		this.name = name;
		this.headquarters = headquarters;
		this.contactnumber = contactnumber;
	}

	public Cruiseline() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
