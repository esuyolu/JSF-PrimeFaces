package com.esuyolu.jsfpaging.bundle;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
public class MessageBean {

	private String firstName;
	private String lastName;
	
	public MessageBean() {
		this.firstName = "Esma";
		this.lastName = "Suyolu";
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	
}
