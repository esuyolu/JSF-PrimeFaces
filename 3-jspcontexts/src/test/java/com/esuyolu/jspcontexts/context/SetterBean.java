package com.esuyolu.jspcontexts.context;

import java.io.IOException;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@ManagedBean
@RequestScoped
public class SetterBean {
	
	private String myInput;
	
	public SetterBean() {
		myInput = "Esma Suyolu";
	}
	
	public String getMyInput() {
		return myInput;
	}
	
	public void setMyInput(String myInput) {
		this.myInput = myInput;
	}

	public String setToRequest() {
		HttpServletRequest request = FacesUtils.getRequest();
		request.setAttribute("myRequestAttribute", myInput);
		
		return "GetterPage.xhtml";
	}
	
	public void setToSession() {
		HttpSession session = FacesUtils.getSession();
		session.setAttribute("mySessionAttribute", myInput);
		
		HttpServletResponse response = FacesUtils.getResponse();
		
		try {
			response.sendRedirect("GetterPage.xhmtl");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
