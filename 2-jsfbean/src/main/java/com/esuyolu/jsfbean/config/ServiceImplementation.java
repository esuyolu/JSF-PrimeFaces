package com.esuyolu.jsfbean.config;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean(name="serviceObject")
@RequestScoped
public class ServiceImplementation implements ServiceSpecification {

	private String serviceString;
	
	public ServiceImplementation() {
		serviceString = "servis";
	}

	@Override
	public String getServiceString() {
		return serviceString;
	}

}
