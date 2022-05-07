package com.esuyolu.jsfbean.scope;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class MySessionBean {

	private int myProperty;

	public MySessionBean() {
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
