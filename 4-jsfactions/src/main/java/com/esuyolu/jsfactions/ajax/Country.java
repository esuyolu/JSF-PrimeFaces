package com.esuyolu.jsfactions.ajax;

import java.util.List;

public class Country {

	private long countryId;
	private String countryName;
	private List<Province> provinceList;
	
	public Country() {}
	
	public Country(long countryId, String countryName) {
		this.countryId = countryId;
		this.countryName = countryName;
	}

	public long getCountryId() {
		return countryId;
	}
	public void setCountryId(long countryId) {
		this.countryId = countryId;
	}
	public String getCountryName() {
		return countryName;
	}
	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}
	public List<Province> getProvinceList() {
		return provinceList;
	}
	public void setProvinceList(List<Province> provinceList) {
		this.provinceList = provinceList;
	}
}
