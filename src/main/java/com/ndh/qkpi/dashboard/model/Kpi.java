package com.ndh.qkpi.dashboard.model;

public class Kpi {

	private int actualValue;
	private int budgetedValue;
	private String name;
	private String currency;
	private int diffabs;
	private int direction;
	public Kpi() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Kpi(int actualValue, int budgetedValue, String name, String currency, int diffabs, int direction) {
		super();
		this.actualValue = actualValue;
		this.budgetedValue = budgetedValue;
		this.name = name;
		this.currency = currency;
		this.diffabs = diffabs;
		this.direction = direction;
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
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public int getDiffabs() {
		return diffabs;
	}
	public void setDiffabs(int diffabs) {
		this.diffabs = diffabs;
	}
	public int getDirection() {
		return direction;
	}
	public void setDirection(int direction) {
		this.direction = direction;
	}
	@Override
	public String toString() {
		return "Kpi [actualValue=" + actualValue + ", budgetedValue=" + budgetedValue + ", name=" + name + ", currency="
				+ currency + ", diffabs=" + diffabs + ", direction=" + direction + "]";
	}
	
}
