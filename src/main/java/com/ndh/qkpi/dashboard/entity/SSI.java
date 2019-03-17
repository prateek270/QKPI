package com.ndh.qkpi.dashboard.entity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;



@Entity
public class SSI {
	
	@Id
	@GeneratedValue
	private int id;
	private String countryName;
	private int ranks;
	public SSI() {
		super();
		// TODO Auto-generated constructor stub
	}
	public SSI( String countryName, int ranks) {
		super();
		this.countryName = countryName;
		this.ranks = ranks;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCountryName() {
		return countryName;
	}
	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}
	public int getRanks() {
		return ranks;
	}
	public void setRanks(int ranks) {
		this.ranks = ranks;
	}
	@Override
	public String toString() {
		return "SSI [id=" + id + ", countryName=" + countryName + ", ranks=" + ranks + "]";
	}
	
	

}
