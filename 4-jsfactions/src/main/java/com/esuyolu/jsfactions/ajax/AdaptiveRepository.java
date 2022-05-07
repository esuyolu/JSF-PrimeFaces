package com.esuyolu.jsfactions.ajax;

import java.util.ArrayList;
import java.util.List;

public class AdaptiveRepository {

	private List<Country> countryList;
	
	public AdaptiveRepository() {
		countryList = new ArrayList<Country>();
		
		Country turkey = new Country(90, "Türkiye");
		turkey.setProvinceList(new ArrayList<Province>());
		turkey.getProvinceList().add(new Province(212, "İstanbul Avrupa"));
		turkey.getProvinceList().add(new Province(216, "İstanbul Asya"));
		turkey.getProvinceList().add(new Province(312, "Ankara"));
		turkey.getProvinceList().add(new Province(232, "İzmir"));
		countryList.add(turkey);
		
		Country azerbaijan = new Country(994, "Azerbaycan");
		azerbaijan.setProvinceList(new ArrayList<Province>());
		azerbaijan.getProvinceList().add(new Province(12, "Bakü"));
		azerbaijan.getProvinceList().add(new Province(171, "Lenkaran"));
		azerbaijan.getProvinceList().add(new Province(136, "Nahçıvan"));
		countryList.add(azerbaijan);
	}
	
	public List<Country> selectCountryList() {
		return countryList;
	}
	
	public Country selectCountry(long countryId) {
		if (countryId == 0) {
			return null;
		}
		
		for (Country country : countryList) {
			if (country.getCountryId() == countryId) {
				return country;
			}
		}
		
		return null;
	}
	
	public Province selectProvince(long provinceId) {
		if (provinceId == 0) {
			return null;
		}
		
		for (Country country : countryList) {
			for (Province province : country.getProvinceList()) {
				if (province.getProvinceId() == provinceId) {
					return province;
				}
			}
		}
		
		return null;
	}
}
