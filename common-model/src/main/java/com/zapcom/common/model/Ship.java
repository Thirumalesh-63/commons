package com.zapcom.common.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "ship")
public class Ship {
	
	
	public Ship() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Ship(int id, String name, Cruiseline cruiseline, String capacity) {
		super();
		this.id = id;
		this.name = name;
		this.cruiseline = cruiseline;
		this.capacity = capacity;
	}

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

	public Cruiseline getCruiseline() {
		return cruiseline;
	}

	public void setCruiseline(Cruiseline cruiseline) {
		this.cruiseline = cruiseline;
	}

	public String getCapacity() {
		return capacity;
	}

	public void setCapacity(String capacity) {
		this.capacity = capacity;
	}

	@Id
	private int id;
	
	private String name;
	
	
	@DBRef
	private Cruiseline cruiseline;
	
	private String capacity;
	
	
	

}
