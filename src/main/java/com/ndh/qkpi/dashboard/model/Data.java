package com.ndh.qkpi.dashboard.model;

import java.util.ArrayList;

public class Data {

	private ArrayList<Graph> graphs;

	public Data() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Data(ArrayList<Graph> graphs) {
		super();
		this.graphs = graphs;
	}

	public ArrayList<Graph> getGraphs() {
		return graphs;
	}

	public void setGraphs(ArrayList<Graph> graphs) {
		this.graphs = graphs;
	}

	@Override
	public String toString() {
		return "Data [graphs=" + graphs + "]";
	}
	
	
	

}
