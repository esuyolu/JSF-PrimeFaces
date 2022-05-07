package com.esuyolu.jsfactions.navigation;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;

@ManagedBean
@RequestScoped
public class ImplicitBean {
	private String inputString;
	
	public ImplicitBean() {
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
		return "TargetSuccessPage.xhtml";
	}
	
	public String successedOrStay() {
		FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_ERROR, "Sicim geçersiz.", "Sicim değeri en az 4 boyunda olmalı.");
		FacesContext.getCurrentInstance().addMessage("myForm:myString", message);
		
		if (inputString != null && inputString.length() > 3) {
			return "TargetSuccessPage.xhtml";
		}
		return null;
	}
	
	public String successedOrFail() {
		FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_ERROR, "Sicim geçersiz.", "Sicim değeri en az 4 boyunda olmalı.");
		FacesContext.getCurrentInstance().addMessage("myForm:myString", message);
		
		if (inputString == null || inputString.length() <= 3) {
			return "TargetFailPage.xhtml";
		}
		return "TargetSuccessPage.xhtml";
	}
}
