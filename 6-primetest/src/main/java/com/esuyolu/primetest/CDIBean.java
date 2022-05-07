package com.esuyolu.primetest;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named
@RequestScoped
public class CDIBean {
	private String myProperty;
	@Inject
	private CDIInterface myInterface;
	
	@PostConstruct
	public void initialize() {
		myProperty = "Esma Suyolu";
	}
	
	public String getMyProperty() {
		return myProperty;
	}
	
	public String getMyService() {
		return "Bean " + myInterface.getService();
	}
}
