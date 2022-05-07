package com.esuyolu.jsfbasics.various;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
public class VariousBean {
	private String myAreaValue;
	private String mySecretValue;
	private String myHiddenValue;

	public VariousBean() {
		mySecretValue = "Gizli";
		myHiddenValue = "Saklı";
	}
	
	public String getMyAreaValue() {
		return myAreaValue;
	}

	public void setMyAreaValue(String myAreaValue) {
		this.myAreaValue = myAreaValue;
	}
	
	public String getMySecretValue() {
		return mySecretValue;
	}

	public void setMySecretValue(String mySecretValue) {
		this.mySecretValue = mySecretValue;
	}
	
	public String getMyHiddenValue() {
		return myHiddenValue;
	}

	public void setMyHiddenValue(String myHiddenValue) {
		this.myHiddenValue = myHiddenValue;
	}

	public void perform() {
		System.out.println("Yazı Alanı: " + myAreaValue);
		System.out.println("Gizli Değer: " + mySecretValue);
		System.out.println("Saklı Değer: " + myHiddenValue);
	}
}
