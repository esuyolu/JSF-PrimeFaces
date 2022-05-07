package com.esuyolu.jsfbean.config;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
public class ClientBean {

	private String clientString;
	
	@ManagedProperty("#{serviceBean}")
	public ServiceBean serviceBean;
	
	public ClientBean() {
		clientString = "istemci";
	}
	
	public String getDependencyString() {
		return clientString + " " + serviceBean.getServiceString();
	}

	public ServiceBean getServiceBean() {
		return serviceBean;
	}

	public void setServiceBean(ServiceBean serviceBean) {
		this.serviceBean = serviceBean;
	}
	
	
	
}
