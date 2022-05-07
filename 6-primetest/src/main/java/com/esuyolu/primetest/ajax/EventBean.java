package com.esuyolu.primetest.ajax;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named
@RequestScoped
public class EventBean {
	
	private String keyText;
	private String blurText;
	
	public String getKeyText() {
		return keyText;
	}
	
	public void setKeyText(String keyText) {
		this.keyText = keyText;
	}
	
	public String getBlurText() {
		return blurText;
	}
	
	public void setBlurText(String blurText) {
		this.blurText = blurText;
	}
}
