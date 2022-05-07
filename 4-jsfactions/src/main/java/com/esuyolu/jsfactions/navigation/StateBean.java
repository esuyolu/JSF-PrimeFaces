package com.esuyolu.jsfactions.navigation;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class StateBean {

	private boolean currentState;
	
	public StateBean() {}
	
	public void setStateOn() {
		currentState = true;
	}
	
	public void setStateOff() {
		currentState = false;
	}

	public boolean isCurrentState() {
		return currentState;
	}

	public void setCurrentState(boolean currentState) {
		this.currentState = currentState;
	}
}
