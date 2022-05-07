package com.esuyolu.jsfactions.ajax;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean
@ViewScoped
public class AdaptiveBean {

	private List<Country> countryList;
	private List<Province> provinceList;
	
	private long countryId;
	private long provinceId;
	
	private Country country;
	private Province province;
	
	public AdaptiveBean() {
		AdaptiveRepository repository = new AdaptiveRepository();
		countryList = repository.selectCountryList();
	}
	
	public List<Country> getCountryList() {
		return countryList;
	}
	public void setCountryList(List<Country> countryList) {
		this.countryList = countryList;
	}
	public List<Province> getProvinceList() {
		return provinceList;
	}
	public void setProvinceList(List<Province> provinceList) {
		this.provinceList = provinceList;
	}
	public long getCountryId() {
		return countryId;
	}
	public void setCountryId(long countryId) {
		this.countryId = countryId;
		if (countryId == 0) {
			provinceId = 0;
			provinceList = new ArrayList<Province>();
			country = new Country();
		} else {
			AdaptiveRepository repository = new AdaptiveRepository();
			country = repository.selectCountry(countryId);
			provinceList = country.getProvinceList();
		}
	}
	public long getProvinceId() {
		return provinceId;
	}
	public void setProvinceId(long provinceId) {
		this.provinceId = provinceId;
		if (provinceId == 0) {
			countryId = 0;
			country = new Country();
			provinceList = new ArrayList<Province>();
		} else {
			AdaptiveRepository repository = new AdaptiveRepository();
			province = repository.selectProvince(provinceId);
		}
	}
	public Country getCountry() {
		return country;
	}
	public void setCountry(Country country) {
		this.country = country;
	}
	public Province getProvince() {
		return province;
	}
	public void setProvince(Province province) {
		this.province = province;
	}
	
	
}
