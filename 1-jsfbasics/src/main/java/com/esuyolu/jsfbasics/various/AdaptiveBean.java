package com.esuyolu.jsfbasics.various;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
public class AdaptiveBean {

	private String myString;
	private boolean myRendered;
	
	public AdaptiveBean() {
		myString = "string";
		myRendered = true;
	}

	public String getMyString() {
		return myString;
	}

	public void setMyString(String myString) {
		this.myString = myString;
	}

	public boolean isMyRendered() {
		return myRendered;
	}

	public void setMyRendered(boolean myRendered) {
		this.myRendered = myRendered;
	}
	
	
}
