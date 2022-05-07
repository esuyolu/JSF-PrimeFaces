package com.esuyolu.primetest;

import javax.inject.Named;

@Named
public class CDIImplementation implements CDIInterface {

	@Override
	public String getService() {
		return "CDI";
	}

}
