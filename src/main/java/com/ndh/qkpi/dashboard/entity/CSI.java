package com.ndh.qkpi.dashboard.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity
public class CSI {
	
	@Id
	@GeneratedValue
	private int id;
	private String countryName;
	private int ranks;
	public CSI() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public CSI(String countryName, int ranks) {
		super();
		this.countryName = countryName;
		this.ranks = ranks;
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
		return "CSI [id=" + id + ", countryName=" + countryName + ", ranks=" + ranks + "]";
	}
	
	
	
	
	
	

}
