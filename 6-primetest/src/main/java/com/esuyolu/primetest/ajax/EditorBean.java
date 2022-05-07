package com.esuyolu.primetest.ajax;

import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Named;

@Named
@RequestScoped
public class EditorBean {
	
	private String myHtml;

	public String getMyHtml() {
		return myHtml;
	}

	public void setMyHtml(String myHtml) {
		this.myHtml = myHtml;
	}
	
	public void submitForm() {
		System.out.println("HTML: \n" + myHtml);
		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("HTML", myHtml));
	}
}
