package com.esuyolu.primetest;

import java.util.Date;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean
@ViewScoped
public class PrimeBean {
	private Date primeDate;
	
	public PrimeBean() {
		primeDate = new Date(19, 4, 19);
	}
	
	public Date getPrimeDate() {
		return primeDate;
	}
}
