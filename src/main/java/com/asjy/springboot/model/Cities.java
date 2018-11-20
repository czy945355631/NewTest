package com.asjy.springboot.model;

import java.util.List;

public class Cities {
	private String internalID;
	private String provinceInternalID;
	private String cityName;
	private List<Prefectures> prefectures;
	
	public String getInternalID() {
		return internalID;
	}
	public void setInternalID(String internalID) {
		this.internalID = internalID;
	}
	public String getProvinceInternalID() {
		return provinceInternalID;
	}
	public void setProvinceInternalID(String provinceInternalID) {
		this.provinceInternalID = provinceInternalID;
	}
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	public List<Prefectures> getPrefectures() {
		return prefectures;
	}
	public void setPrefectures(List<Prefectures> prefectures) {
		this.prefectures = prefectures;
	}
	
}
