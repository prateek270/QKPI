package com.ndh.qkpi.dashboard.model;

import java.util.ArrayList;

public class Scores {

	private String title;
	private ArrayList<Double > currentMonth;
	private ArrayList<Double > previousMonth;
	private ArrayList<String > countryCode;
	public Scores() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Scores(String title, ArrayList<Double> currentMonth, ArrayList<Double> previousMonth,
			ArrayList<String> countryCode) {
		super();
		this.title = title;
		this.currentMonth = currentMonth;
		this.previousMonth = previousMonth;
		this.countryCode = countryCode;
	}


	public ArrayList<Double> getCurrentMonth() {
		return currentMonth;
	}
	
	public void setCurrentMonth(ArrayList<Double> currentMonth) {
		this.currentMonth = currentMonth;
	}
	
	public ArrayList<Double> getPreviousMonth() {
		return previousMonth;
	}
	
	public void setPreviousMonth(ArrayList<Double> previousMonth) {
		this.previousMonth = previousMonth;
	}
	
	public ArrayList<String> getCountryCode() {
		return countryCode;
	}
	
	public void setCountryCode(ArrayList<String> countryCode) {
		this.countryCode = countryCode;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	@Override
	public String toString() {
		return "Scores [title=" + title + ", currentMonth=" + currentMonth + ", previousMonth=" + previousMonth
				+ ", countryCode=" + countryCode + "]";
	}
	
	
	
	
}
