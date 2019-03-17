package com.ndh.qkpi.dashboard.model;

import java.util.ArrayList;


public class Dashboard {	
	
	private ArrayList<Budgeted> kpi;
	private ArrayList<Scores> score;
	private ArrayList<Result> res;
	private ArrayList<Index> index;
	private ArrayList<IndexResult> indexResult;
	

	
	public Dashboard() {
		super();
	}

	

	public Dashboard(ArrayList<Budgeted> kpi, ArrayList<Scores> score, ArrayList<Result> res, ArrayList<Index> index,
			ArrayList<IndexResult> indexResult) {
		super();
		this.kpi = kpi;
		this.score = score;
		this.res = res;
		this.index = index;
		this.indexResult = indexResult;
	}



	public ArrayList<Budgeted> getKpi() {
		return kpi;
	}

	public void setKpi(ArrayList<Budgeted> kpi) {
		this.kpi = kpi;
	}

	public ArrayList<Scores> getScore() {
		return score;
	}

	public void setScore(ArrayList<Scores> score) {
		this.score = score;
	}

	public ArrayList<Result> getRes() {
		return res;
	}

	public void setRes(ArrayList<Result> res) {
		this.res = res;
	}
	public ArrayList<Index> getIndex() {
		// TODO Auto-generated method stub
		return index;
	}

	public void setIndex(ArrayList<Index> index) {
		this.index = index;
	}

	
	public ArrayList<IndexResult> getIndexResult() {
		return indexResult;
	}

	public void setIndexResult(ArrayList<IndexResult> indexResult) {
		this.indexResult = indexResult;
	}

	@Override
	public String toString() {
		return "Dashboard [kpi=" + kpi + ", score=" + score + ", res=" + res + ", index=" + index + ", indexResult="
				+ indexResult + "]";
	}

	

	

	

	
	

	
	
}
	



	

