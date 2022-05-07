package com.esuyolu.jsfbasics.entity;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
public class GridBean {

	public List<Data> dataList;
	
	public GridBean() {
		dataList = new ArrayList<Data>();
		dataList.add(new Data(301, "bir", 99.11));
		dataList.add(new Data(302, "iki", 99.22));
		dataList.add(new Data(303, "uc", 99.33));
	}

	public List<Data> getDataList() {
		return dataList;
	}
}
