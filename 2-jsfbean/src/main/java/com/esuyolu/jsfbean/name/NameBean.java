package com.esuyolu.jsfbean.name;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean(name = "myBean", eager = true)
@RequestScoped
public class NameBean {

	private String myProperty;

	public NameBean() {
		System.out.println("hazırlanıyor......");
		myProperty = "özelliğim";
	}

	public String getMyProperty() {
		return myProperty;
	}
	
}
