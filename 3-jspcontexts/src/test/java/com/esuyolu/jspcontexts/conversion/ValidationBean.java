package com.esuyolu.jspcontexts.conversion;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
public class ValidationBean {
	private long longValue;
	private double doubleValue;
	private String stringValue;
	private String requiredValue;
	private String phoneNumber;
	private String emailAddress;
	
	public ValidationBean() {
		longValue = 12345;
		doubleValue = 1234.5678;
		stringValue = "esma";
		requiredValue = "gerekli değer";
		phoneNumber = "0534 403 47 41";
		emailAddress = "esmasuyolu@gmail.com";
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
	public String getStringValue() {
		return stringValue;
	}
	public void setStringValue(String stringValue) {
		this.stringValue = stringValue;
	}
	public String getRequiredValue() {
		return requiredValue;
	}
	public void setRequiredValue(String requiredValue) {
		this.requiredValue = requiredValue;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getEmailAddress() {
		return emailAddress;
	}
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public void perform() {
		System.out.println("long value: " + longValue);
		System.out.println("double value: " + doubleValue);
		System.out.println("string value: " + stringValue);
		System.out.println("required value: " + requiredValue);
		System.out.println("phoneNumber value: " + phoneNumber);
		System.out.println("emailAddress value: " + emailAddress);
	}
}
