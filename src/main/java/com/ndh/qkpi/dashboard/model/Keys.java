package com.ndh.qkpi.dashboard.model;

import java.util.ArrayList;

public class Keys {
	
	private String title;
	private ArrayList<String> values;
	public Keys() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Keys(String title, ArrayList<String> values) {
		super();
		this.title = title;
		this.values = values;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public ArrayList<String> getValues() {
		return values;
	}
	public void setValues(ArrayList<String> values) {
		this.values = values;
	}
	@Override
	public String toString() {
		return "Keys [title=" + title + ", values=" + values + "]";
	}
	
	

}
