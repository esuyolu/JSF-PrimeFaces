package com.esuyolu.jsfbasics.various;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
public class GeneralBean {

	private String myString;
	
	public GeneralBean() {
		myString = "string";
	}

	public String getMyString() {
		return myString;
	}

	public void setMyString(String myString) {
		this.myString = myString;
	}
	
	
}
