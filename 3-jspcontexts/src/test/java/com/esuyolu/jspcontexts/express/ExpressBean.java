package com.esuyolu.jspcontexts.express;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
public class ExpressBean {
	private long expressId;
	private String expressName;
	private double expressValue;
	private Sample sample;
	private List<String> stringList;
	private List<Sample> sampleList;

	public ExpressBean() {
		expressId = 301;
		expressName = "Esma";
		expressValue = 3.14;
		sample = new Sample(701, "Esma Suyolu", 76.54321);
		stringList = new ArrayList<String>();
		stringList.add("JPA");
		stringList.add("JSF");
		stringList.add("CDI");
		stringList.add("JAX-RS");
		sampleList = new ArrayList<Sample>();
		sampleList.add(new Sample(201, "HTML", 23.4));
		sampleList.add(new Sample(202, "CSS", 43.1));
		sampleList.add(new Sample(201, "JavaScript", 22.1));
	}
	
	public void myMethod() {
		System.out.println("metot çağrıldı");
	}
	
	public void myMethod(double parameter) {
		System.out.println("metot çağrıldı. değer: " + parameter);
	}
	
	public long getExpressId() {
		return expressId;
	}
	public void setExpressId(long expressId) {
		this.expressId = expressId;
	}
	public String getExpressName() {
		return expressName;
	}
	public void setExpressName(String expressName) {
		this.expressName = expressName;
	}
	public double getExpressValue() {
		return expressValue;
	}
	public void setExpressValue(double expressValue) {
		this.expressValue = expressValue;
	}

	public Sample getSample() {
		return sample;
	}

	public void setSample(Sample sample) {
		this.sample = sample;
	}
	
	public List<String> getStringList() {
		return stringList;
	}
	
	public List<Sample> getSampleList() {
		return sampleList;
	}
}
