package com.ndh.qkpi.dashboard.model;

import java.util.ArrayList;

import com.ndh.qkpi.dashboard.entity.Filter;

public class GraphDetails {

	
	private Data data;
	private ArrayList<String> xAxis;
	private ArrayList<Filter> filter;
	public GraphDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	public GraphDetails(Data data, ArrayList<String> xAxis, ArrayList<Filter> filter) {
		super();
		this.data = data;
		this.xAxis = xAxis;
		this.filter = filter;
	}
	public Data getData() {
		return data;
	}
	public void setData(Data data) {
		this.data = data;
	}
	public ArrayList<String> getxAxis() {
		return xAxis;
	}
	public void setxAxis(ArrayList<String> xAxis) {
		this.xAxis = xAxis;
	}
	public ArrayList<Filter> getFilter() {
		return filter;
	}
	public void setFilter(ArrayList<Filter> filter) {
		this.filter = filter;
	}
	@Override
	public String toString() {
		return "GraphDetails [data=" + data + ", xAxis=" + xAxis + ", filter=" + filter + "]";
	}
	
		
	
}
