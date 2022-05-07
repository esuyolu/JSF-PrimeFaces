package com.esuyolu.jsfbasics.entity;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
public class ChoiceBean {
	
	private long selectedDataId;

	public ChoiceBean() {
		//selectedDataId = 302;
	}

	public List<Data> getDataList() {
		List<Data> dataList = new ArrayList<Data>();
		dataList.add(new Data(301, "bir", 99.11));
		dataList.add(new Data(302, "iki", 99.22));
		dataList.add(new Data(303, "uc", 99.33));
		return dataList;
	}

	public long getSelectedDataId() {
		return selectedDataId;
	}

	public void setSelectedDataId(long selectedDataId) {
		this.selectedDataId = selectedDataId;
	}
	
	public void save() {
		System.out.println("seçilen veri: " + selectedDataId);
	}
	
}
