package com.esuyolu.jsfactions.event;

import javax.faces.event.AbortProcessingException;
import javax.faces.event.ValueChangeEvent;
import javax.faces.event.ValueChangeListener;

public class ChangeAdapter implements ValueChangeListener {

	@Override
	public void processValueChange(ValueChangeEvent event) throws AbortProcessingException {
		System.out.println("Class Event Bileşeni: " + event.getComponent().getClientId());
		System.out.println("Yeni Deger: " + event.getNewValue());
		System.out.println("Eski Deger: " + event.getOldValue());
		System.out.println("Method Event Bileşeni: " + event.getComponent().getClientId());
	}
}
