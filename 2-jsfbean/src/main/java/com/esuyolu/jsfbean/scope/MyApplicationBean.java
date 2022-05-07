package com.esuyolu.jsfbean.scope;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

@ManagedBean
@ApplicationScoped
public class MyApplicationBean {

	private int myProperty;

	public MyApplicationBean() {
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
