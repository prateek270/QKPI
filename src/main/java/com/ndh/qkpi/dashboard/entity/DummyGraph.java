package com.ndh.qkpi.dashboard.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class DummyGraph {

	@Id
	@GeneratedValue
	private int id;
	private double actualValue;
	private double budgetedValue;
	private String xAxis;
	public DummyGraph() {
		super();
		// TODO Auto-generated constructor stub
	}
	public DummyGraph(int id, double actualValue, double budgetedValue, String xAxis) {
		super();
		this.id = id;
		this.actualValue = actualValue;
		this.budgetedValue = budgetedValue;
		this.xAxis = xAxis;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getActualValue() {
		return actualValue;
	}
	public void setActualValue(double actualValue) {
		this.actualValue = actualValue;
	}
	public double getBudgetedValue() {
		return budgetedValue;
	}
	public void setBudgetedValue(double budgetedValue) {
		this.budgetedValue = budgetedValue;
	}
	public String getxAxis() {
		return xAxis;
	}
	public void setxAxis(String xAxis) {
		this.xAxis = xAxis;
	}
	@Override
	public String toString() {
		return "DummyGraph [id=" + id + ", actualValue=" + actualValue + ", budgetedValue=" + budgetedValue + ", xAxis="
				+ xAxis + "]";
	}
	
	
}
