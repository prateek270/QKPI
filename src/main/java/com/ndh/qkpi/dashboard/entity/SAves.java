package com.ndh.qkpi.dashboard.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class SAves {


	@Id
	@GeneratedValue
	private int id;
	private double currentMonth;
	private double previousMonth;
	private String countryCode;
	
	public SAves() {
		super();
	}

	public SAves( double currentMonth, double previousMonth, String countryCode) {
		super();
		this.currentMonth = currentMonth;
		this.previousMonth = previousMonth;
		this.countryCode = countryCode;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getCurrentMonth() {
		return currentMonth;
	}

	public void setCurrentMonth(double currentMonth) {
		this.currentMonth = currentMonth;
	}

	public double getPreviousMonth() {
		return previousMonth;
	}

	public void setPreviousMonth(double previousMonth) {
		this.previousMonth = previousMonth;
	}

	public String getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}
	

	
	
}
