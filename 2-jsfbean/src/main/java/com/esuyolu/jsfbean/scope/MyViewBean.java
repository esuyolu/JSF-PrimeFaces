package com.esuyolu.jsfbean.scope;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean
@ViewScoped
public class MyViewBean {

	private int myProperty;

	public MyViewBean() {
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
