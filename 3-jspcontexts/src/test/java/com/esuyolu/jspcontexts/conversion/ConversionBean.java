package com.esuyolu.jspcontexts.conversion;

import java.util.Date;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
public class ConversionBean {
	private long longValue;
	private double doubleValue;
	private Date dateValue;
	private EmailAddress emailAddress;
	
	public ConversionBean() {
		longValue = 12345;
		doubleValue = 1234.5678;
		dateValue = new  Date();
		emailAddress = new EmailAddress("esmasuyolu","gmail", "com");
	}
	
	public long getLongValue() {
		return longValue;
	}
	public void setLongValue(long longValue) {
		this.longValue = longValue;
	}
	public double getDoubleValue() {
		return doubleValue;
	}
	public void setDoubleValue(double doubleValue) {
		this.doubleValue = doubleValue;
	}
	
	public Date getDateValue() {
		return dateValue;
	}

	public void setDateValue(Date dateValue) {
		this.dateValue = dateValue;
	}

	
	public EmailAddress getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(EmailAddress emailAddress) {
		this.emailAddress = emailAddress;
	}

	public void perform() {
		System.out.println("long value: " + longValue);
		System.out.println("double value: " + doubleValue);
	}
}
