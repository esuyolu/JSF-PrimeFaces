package com.esuyolu.primetest.data;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

import org.primefaces.model.DualListModel;

@Named
@RequestScoped
public class PickerBean {
	private DualListModel<String> cityModel;

	@PostConstruct
    public void init() {
        List<String> cityListSource = new ArrayList<>();
        List<String> cityListTarget = new ArrayList<>();
        
        cityListSource.add("San Francisco");
        cityListSource.add("London");
        cityListSource.add("Paris");
        cityListSource.add("Istanbul");
        cityListSource.add("Berlin");
        cityListSource.add("Barcelona");
        cityListSource.add("Rome");
        
        cityModel = new DualListModel<String>(cityListSource, cityListTarget);
    }

	public DualListModel<String> getCityModel() {
		return cityModel;
	}
	
	public void setCityModel(DualListModel<String> cityModel) {
		this.cityModel = cityModel;
	}
}
