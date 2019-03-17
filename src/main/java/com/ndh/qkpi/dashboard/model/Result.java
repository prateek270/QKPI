package com.ndh.qkpi.dashboard.model;

import java.util.ArrayList;

public class Result {

	private String type;
	private String title;
	private ArrayList<Keys> keys;
	
	
	public Result() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Result(String type, String title, ArrayList<Keys> keys) {
		super();
		this.type = type;
		this.title = title;
		this.keys = keys;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public ArrayList<Keys> getKeys() {
		return keys;
	}


	public void setKeys(ArrayList<Keys> keys) {
		this.keys = keys;
	}


	@Override
	public String toString() {
		return "Result [type=" + type + ", title=" + title + ", keys=" + keys + "]";
	}

	

}
