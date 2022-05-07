package com.esuyolu.jsfbean.scope;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
public class MyRequestBean {

	private int myProperty;

	public MyRequestBean() {
		myProperty = 6; 
	}

	public int getMyProperty() {
		return myProperty;
	}

	public void setMyProperty(int myProperty) {
		this.myProperty = myProperty;
	}
	
	public void increment() {
		myProperty++;
	}
	
}
