package com.ndh.qkpi.dashboard.model;

public class IndexScreen {

	private String country;
	private int rank;
	private String color;
	public IndexScreen() {
		super();
		// TODO Auto-generated constructor stub
	}
	public IndexScreen(String country, int rank, String color) {
		super();
		this.country = country;
		this.rank = rank;
		this.color = color;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public int getRank() {
		return rank;
	}
	public void setRank(int rank) {
		this.rank = rank;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	@Override
	public String toString() {
		return "IndexScreen [country=" + country + ", rank=" + rank + ", color=" + color + "]";
	}
	
}
