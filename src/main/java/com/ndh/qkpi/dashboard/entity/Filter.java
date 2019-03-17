package com.ndh.qkpi.dashboard.entity;

import java.util.Collection;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;



@Entity
public class Filter {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String kpiName;
	private String title;
	private String type;
	@ElementCollection
	private Collection<String> values;
	
	public Filter() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Filter(String kpiName, String title, String type, Collection<String> values) {
		super();
		this.kpiName = kpiName;
		this.title = title;
		this.type = type;
		this.values = values;
	}

	public String getKpiName() {
		return kpiName;
	}

	public void setKpiName(String kpiName) {
		this.kpiName = kpiName;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Collection<String> getValues() {
		return values;
	}

	public void setValues(Collection<String> values) {
		this.values = values;
	}

	@Override
	public String toString() {
		return "Filter [kpiName=" + kpiName + ", title=" + title + ", type=" + type + ", values=" + values + "]";
	}

	
	
	
	
}
