package com.zapcom.common.model;

import java.util.Date;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "cruise")
public class Cruise {

	@Id
	private int id;
	
	
	
	@DBRef
	private Ship ship;
	
	
	@DBRef
	private Cruiseline cruiseline;
	
	public Cruise() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Ship getShip() {
		return ship;
	}

	public void setShip(Ship ship) {
		this.ship = ship;
	}

	public Cruiseline getCruiseline() {
		return cruiseline;
	}

	public void setCruiseline(Cruiseline cruiseline) {
		this.cruiseline = cruiseline;
	}

	public String getStartdestination() {
		return startdestination;
	}

	public void setStartdestination(String startdestination) {
		this.startdestination = startdestination;
	}

	public String getEnddestination() {
		return enddestination;
	}

	public void setEnddestination(String enddestination) {
		this.enddestination = enddestination;
	}

	public List<String> getItinerary() {
		return itinerary;
	}

	public void setItinerary(List<String> itinerary) {
		this.itinerary = itinerary;
	}

	public Date getStartdate() {
		return startdate;
	}

	public void setStartdate(Date startdate) {
		this.startdate = startdate;
	}

	public Date getEnddate() {
		return enddate;
	}

	public void setEnddate(Date enddate) {
		this.enddate = enddate;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}
	
	private String cruiseName;

	public Cruise(int id, Ship ship, Cruiseline cruiseline, String cruiseName, String startdestination,
			String enddestination, List<String> itinerary, Date startdate, Date enddate, String price) {
		super();
		this.id = id;
		this.ship = ship;
		this.cruiseline = cruiseline;
		this.cruiseName = cruiseName;
		this.startdestination = startdestination;
		this.enddestination = enddestination;
		this.itinerary = itinerary;
		this.startdate = startdate;
		this.enddate = enddate;
		this.price = price;
	}

	public String getCruiseName() {
		return cruiseName;
	}

	public void setCruiseName(String cruiseName) {
		this.cruiseName = cruiseName;
	}

	private String startdestination;
	
	private String enddestination;
	
	private List<String> itinerary;
	
	private Date startdate;
	
	private Date enddate;
	
	private String price;
	
	
	
	
}
