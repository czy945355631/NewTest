package com.asjy.springboot.model;

import java.util.List;

public class Provinces {
	private String internalID;
	private String provinceName;
	private List<Cities> Cities;
	
	public String getInternalID() {
		return internalID;
	}
	public void setInternalID(String internalID) {
		this.internalID = internalID;
	}
	public String getProvinceName() {
		return provinceName;
	}
	public void setProvinceName(String provinceName) {
		this.provinceName = provinceName;
	}
	public List<Cities> getCities() {
		return Cities;
	}
	public void setCities(List<Cities> cities) {
		Cities = cities;
	}
	
}
