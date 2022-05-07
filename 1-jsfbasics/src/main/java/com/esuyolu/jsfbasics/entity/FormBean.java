package com.esuyolu.jsfbasics.entity;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
public class FormBean {

	private Data data;
	
	public FormBean() {
		data = new Data(123, "veri", 3.14);
	}
	
	public Data getData() {
		return data;
	}
	
	public void perform() {
		System.out.println("veri işleniyor: " + data.getDataId() + " " + 
							data.getDataName() + " " +
							data.getDataValue());
	}
}
