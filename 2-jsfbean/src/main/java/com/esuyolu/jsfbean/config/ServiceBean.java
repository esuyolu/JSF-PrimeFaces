package com.esuyolu.jsfbean.config;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
public class ServiceBean {

	private String serviceString;
	
	public ServiceBean() {
		serviceString = "servis";
	}

	public String getServiceString() {
		return serviceString;
	}

}
