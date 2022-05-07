package com.esuyolu.jsfpaging.bundle;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

@ManagedBean
@SessionScoped
public class LocaleBean {
	
	private static List<Locale> localeList = new ArrayList<Locale>();
	private String localeCode;
	
	static {
		localeList.add(new Locale("tr", "TR"));
		localeList.add(new Locale("en", "GB"));
		localeList.add(new Locale("de", "DE"));
		localeList.add(new Locale("en", "US"));
		localeList.add(new Locale("es", "ES"));
	}
	
	public LocaleBean() {
		/*
		Locale locale = new Locale("tr", "TR");
		FacesContext.getCurrentInstance().getViewRoot().setLocale(locale);
		*/
	}

	public Locale getCurrentLocale() {
		return FacesContext.getCurrentInstance().getViewRoot().getLocale();
	}
	
	public void changeLocale() {
		int space = localeCode.indexOf(" ");
		String language = localeCode.substring(0, space);
		String country = localeCode.substring(space + 1);
		Locale locale = new Locale(language, country);
		FacesContext.getCurrentInstance().getViewRoot().setLocale(locale);
	}
	
	public List<Locale> getLocaleList() {
		return localeList;
	}

	public String getLocaleCode() {
		return localeCode;
	}

	public void setLocaleCode(String localeCode) {
		this.localeCode = localeCode;
	}
	
	
}
