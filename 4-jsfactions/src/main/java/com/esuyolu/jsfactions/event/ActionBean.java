package com.esuyolu.jsfactions.event;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.event.ActionEvent;

@ManagedBean
@RequestScoped
public class ActionBean {

	private String stringValue;
	
	public void listenAction(ActionEvent event) {
		System.out.println("String Degeri: " + stringValue);
		System.out.println("Method Event Bileşeni: " + event.getComponent().getClientId());
	}

	public String getStringValue() {
		return stringValue;
	}

	public void setStringValue(String stringValue) {
		this.stringValue = stringValue;
	}
	
}
