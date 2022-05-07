package com.esuyolu.jspcontexts.context;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@ManagedBean
@RequestScoped
public class GetterBean {
	
	private String myRequestParameter;
	private String myRequestAttribute;
	private String mySessionAttribute;

	public GetterBean() {
		HttpServletRequest request = FacesUtils.getRequest();
		
		myRequestParameter = request.getParameter("myRequestParameter");
		myRequestAttribute = (String) request.getAttribute("myRequestAttribute");
		
		HttpSession session = FacesUtils.getSession();
		mySessionAttribute =  (String) session.getAttribute("mySessionAttribute");
		session.removeAttribute(mySessionAttribute);
	}

	public String getMyRequestParameter() {
		return myRequestParameter;
	}

	public String getMyRequestAttribute() {
		return myRequestAttribute;
	}
	
	public String getMySessionAttribute() {
		return mySessionAttribute;
	}
}
