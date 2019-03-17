package com.ndh.qkpi.dashboard.model;

public class IndexResult {
	
	private String type;
	private String title;
	private int good;
	private int bad;
	
	public IndexResult(String type, String title, int good, int bad) {
		super();
		this.type = type;
		this.title = title;
		this.good = good;
		this.bad = bad;
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
	public int getGood() {
		return good;
	}
	public void setGood(int good) {
		this.good = good;
	}
	public int getBad() {
		return bad;
	}
	public void setBad(int bad) {
		this.bad = bad;
	}
	@Override
	public String toString() {
		return "IndexResult [type=" + type + ", title=" + title + ", good=" + good + ", bad=" + bad + "]";
	}
	
	

}
