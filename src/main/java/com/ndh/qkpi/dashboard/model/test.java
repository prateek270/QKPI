package com.ndh.qkpi.dashboard.model;

import java.util.ArrayList;

public class test {

	private ArrayList<String> xaxis;
	private ArrayList<Double> actual;
	private ArrayList<Double> budgeted;
	public test() {
		super();
		// TODO Auto-generated constructor stub
	}
	public test(ArrayList<String> xaxis, ArrayList<Double> actual, ArrayList<Double> budgeted) {
		super();
		this.xaxis = xaxis;
		this.actual = actual;
		this.budgeted = budgeted;
	}
	public ArrayList<String> getXaxis() {
		return xaxis;
	}
	public void setXaxis(ArrayList<String> xaxis) {
		this.xaxis = xaxis;
	}
	
	
	public ArrayList<Double> getActual() {
		return actual;
	}
	public void setActual(ArrayList<Double> actual) {
		this.actual = actual;
	}
	public ArrayList<Double> getBudgeted() {
		return budgeted;
	}
	public void setBudgeted(ArrayList<Double> budgeted) {
		this.budgeted = budgeted;
	}
	@Override
	public String toString() {
		return "test [xaxis=" + xaxis + ", actual=" + actual + ", budgeted=" + budgeted + "]";
	}
	
	
	
	
}
