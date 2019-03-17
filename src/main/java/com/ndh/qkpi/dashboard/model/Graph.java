package com.ndh.qkpi.dashboard.model;

import java.util.ArrayList;

public class Graph {
	
	private int id;
	private String type;
	private String name;
	private String color;
	private ArrayList<Double> data;
	public Graph() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Graph(String type, String name,String color, ArrayList<Double> data) {
		super();
		this.type = type;
		this.name = name;
		this.color = color;
		this.data = data;
	}
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public ArrayList<Double> getData() {
		return data;
	}
	public void setData(ArrayList<Double> data) {
		this.data = data;
	}
	@Override
	public String toString() {
		return "Graph [id=" + id + ", type=" + type + ", name=" + name + ", color=" + color + ", data=" + data + "]";
	}
	


	

}
