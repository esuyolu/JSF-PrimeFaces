package com.esuyolu.jsfactions.event;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.event.ValueChangeEvent;

@ManagedBean
@RequestScoped
public class ChangeBean {

	private String stringValue;
	
	public ChangeBean() {
		stringValue = "esma suyolu";
	}
	
	public void listenInput(ValueChangeEvent event) {
		System.out.println("Yeni Deger: " + event.getNewValue());
		System.out.println("Eski Deger: " + event.getOldValue());
		System.out.println("Method Event Bileşeni: " + event.getComponent().getClientId());
	}

	public String getStringValue() {
		return stringValue;
	}

	public void setStringValue(String stringValue) {
		this.stringValue = stringValue;
	}
	
}
