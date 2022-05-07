package com.esuyolu.jsfbean.config;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
public class ConsumerBean {

	private String consumerString;
	
	@ManagedProperty("#{serviceObject}")
	public ServiceSpecification serviceSpecification;
	
	public ConsumerBean() {
		consumerString = "istemci";
	}
	
	public String getInversionString() {
		return consumerString + " " + serviceSpecification.getServiceString();
	}

	public ServiceSpecification getServiceSpecification() {
		return serviceSpecification;
	}

	public void setServiceSpecification(ServiceSpecification serviceSpecification) {
		this.serviceSpecification = serviceSpecification;
	}
	
	
	
}
