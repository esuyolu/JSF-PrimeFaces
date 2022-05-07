package com.esuyolu.jsfactions.ajax;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ReferencedBean;

@ManagedBean
@ReferencedBean
public class AjaxBean {

	private String inputValue;
	private String outputValue;
	
	public String getInputValue() {
		return inputValue;
	}
	public void setInputValue(String inputValue) {
		this.inputValue = inputValue;
		outputValue = inputValue + " değerinin çıktısı";
	}
	public String getOutputValue() {
		return outputValue;
	}
	
}
