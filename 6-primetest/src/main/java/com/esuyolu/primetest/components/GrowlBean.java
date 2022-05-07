package com.esuyolu.primetest.components;

import java.util.Date;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

@ManagedBean
@ViewScoped
public class GrowlBean {
	private Date primeDate;
	
	public GrowlBean() {
		primeDate = new Date(19, 4, 1919);
	}
	
	public Date getPrimeDate() {
		return primeDate;
	}
	
	public void setPrimeDate(Date primeDate) {
		this.primeDate = primeDate;
	}
	
	public void submitForm() {
		System.out.println("Tarih: " + primeDate);
		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Tarih: ", "Seçilen Tarih: " + primeDate));
	}
}
