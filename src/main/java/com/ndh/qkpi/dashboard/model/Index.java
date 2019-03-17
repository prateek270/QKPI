package com.ndh.qkpi.dashboard.model;

import java.util.ArrayList;

public class Index {
	private String title;
	private ArrayList<String> countryName;
	private ArrayList<Integer> ranks;
	public Index() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Index(String title, ArrayList<String> countryName, ArrayList<Integer> ranks) {
		super();
		this.title = title;
		this.countryName = countryName;
		this.ranks = ranks;
	}

	public ArrayList<String> getCountryName() {
		return countryName;
	}
	public void setCountryName(ArrayList<String> countryName) {
		this.countryName = countryName;
	}
	public ArrayList<Integer> getRanks() {
		return ranks;
	}
	public void setRanks(ArrayList<Integer> ranks) {
		this.ranks = ranks;
	}
	
	
	public void setTitle(String title) {
		this.title = title;
	}

	@Override
	public String toString() {
		return "Index [countryName=" + countryName + ", ranks=" + ranks + "]";
	}

	public String getTitle() {
		// TODO Auto-generated method stub
		return title;
	}
	
}
