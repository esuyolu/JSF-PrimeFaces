package com.esuyolu.jspcontexts.message;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;

@ManagedBean
@RequestScoped
public class MessageBean {

	private String stringValue;
	private double doubleValue;
	
	public MessageBean() {
		this.stringValue = "";
		this.doubleValue = 0.0;
	}
	
	public String getStringValue() {
		return stringValue;
	}
	
	public void setStringValue(String stringValue) {
		this.stringValue = stringValue;
	}
	
	public double getDoubleValue() {
		return doubleValue;
	}
	
	public void setDoubleValue(double doubleValue) {
		this.doubleValue = doubleValue;
	}
	
	public void process() {
		System.out.println("Sicim: " + stringValue);
		System.out.println("Sayı: " + doubleValue);
		
		if (stringValue.length() < 5) {
			FacesMessage messageString = new FacesMessage(FacesMessage.SEVERITY_ERROR, "Sicim geçersiz.", "Sicim değeri en az 5 boyunda olmalı.");
			FacesContext.getCurrentInstance().addMessage("myForm:myString", messageString);
		}
		
		if (doubleValue < 0) {
			FacesMessage messageDouble = new FacesMessage(FacesMessage.SEVERITY_ERROR, "Sayı geçersiz.", "Sayı en küçük 0 olmalı.");
			FacesContext.getCurrentInstance().addMessage("myForm:myDouble", messageDouble);
		}
		
		if (FacesContext.getCurrentInstance().getMessageList().isEmpty()) {
			FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, "Biçim başarılı.", "Veriler ilgili yerlere gönderildi.");
			FacesContext.getCurrentInstance().addMessage(null, message);
		}
	}
}
