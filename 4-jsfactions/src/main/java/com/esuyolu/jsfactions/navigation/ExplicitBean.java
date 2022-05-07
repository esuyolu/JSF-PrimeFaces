package com.esuyolu.jsfactions.navigation;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;

@ManagedBean
@RequestScoped
public class ExplicitBean {
	private String inputString;
	
	public ExplicitBean() {
		this.inputString = "hello!!!";				
	}

	public void setInputString(String inputString) {
		this.inputString = inputString;
	}
	
	public String getInputString() {
		return inputString;
	}
		
	public String go() {
		System.out.println("Target page sayfasına gidiliyor...");
		return "success";
	}
	
	public String perform() {
		return "pass";
	}
	
	public String successedOrStay() {
		FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_ERROR, "Sicim geçersiz.", "Sicim değeri en az 4 boyunda olmalı.");
		FacesContext.getCurrentInstance().addMessage("myForm:myString", message);
		
		if (inputString != null && inputString.length() > 3) {
			return "success";
		}
		return null;
	}
	
	public String successedOrFail() {
		FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_ERROR, "Sicim geçersiz.", "Sicim değeri en az 4 boyunda olmalı.");
		FacesContext.getCurrentInstance().addMessage("myForm:myString", message);
		
		if (inputString == null || inputString.length() <= 3) {
			return "fail";
		}
		return "success";
	}
}
