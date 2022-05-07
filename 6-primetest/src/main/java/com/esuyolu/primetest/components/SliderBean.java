package com.esuyolu.primetest.components;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean
@ViewScoped
public class SliderBean {
	private int myNumber;
	
	public SliderBean() {
		myNumber = 0;
	}

	public int getMyNumber() {
		return myNumber;
	}

	public void setMyNumber(int myNumber) {
		this.myNumber = myNumber;
	}
}
