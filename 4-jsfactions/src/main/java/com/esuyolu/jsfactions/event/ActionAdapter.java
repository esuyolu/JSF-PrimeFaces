package com.esuyolu.jsfactions.event;

import javax.faces.event.AbortProcessingException;
import javax.faces.event.ActionEvent;
import javax.faces.event.ActionListener;

public class ActionAdapter implements ActionListener {

	@Override
	public void processAction(ActionEvent event) throws AbortProcessingException {
		System.out.println("Class Event Bileşeni: " + event.getComponent().getClientId());
	}

}
