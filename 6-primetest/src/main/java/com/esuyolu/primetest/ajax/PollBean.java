package com.esuyolu.primetest.ajax;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean
@ViewScoped
public class PollBean {

	private int pollCount;

	public int getPollCount() {
		return pollCount;
	}

	public void setPollCount(int pollCount) {
		this.pollCount = pollCount;
	}
	
	public void incrementCount() {
		pollCount++;
	}
}
