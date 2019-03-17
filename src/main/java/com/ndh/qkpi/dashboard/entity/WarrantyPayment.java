package com.ndh.qkpi.dashboard.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class WarrantyPayment {
	@Id
	@GeneratedValue
	private int id;
	private String type;
	private int actualValue;
	private int budgetedValue;
	private String title;
	private int color;
	private String currency;
	private int difference;
	public WarrantyPayment() {
		super();
		// TODO Auto-generated constructor stub
	}
	public WarrantyPayment(String type, int actualValue, int budgetedValue, String title, int color,
			String currency, int difference) {
		super();
		this.type = type;
		this.actualValue = actualValue;
		this.budgetedValue = budgetedValue;
		this.title = title;
		this.color = color;
		this.currency = currency;
		this.difference = difference;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getActualValue() {
		return actualValue;
	}
	public void setActualValue(int actualValue) {
		this.actualValue = actualValue;
	}
	public int getBudgetedValue() {
		return budgetedValue;
	}
	public void setBudgetedValue(int budgetedValue) {
		this.budgetedValue = budgetedValue;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getColor() {
		return color;
	}
	public void setColor(int color) {
		this.color = color;
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	
	
	public int getDifference() {
		return difference;
	}
	public void setDifference(int difference) {
		this.difference = difference;
	}
	@Override
	public String toString() {
		return "WarrantyPayment [type=" + type + ", actualValue=" + actualValue + ", budgetedValue=" + budgetedValue
				+ ", title=" + title + ", color=" + color + ", currency=" + currency
				+ ", difference=" + difference + "]";
	}
	
	
	

}
