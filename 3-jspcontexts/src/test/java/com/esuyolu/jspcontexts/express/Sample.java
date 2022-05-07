package com.esuyolu.jspcontexts.express;

public class Sample {

	private long sampleId;
	private String sampleName;
	private double sampleValue;
	
	public Sample() {}
	
	public Sample(long sampleId, String sampleName, double sampleValue) {
		this.sampleId = sampleId;
		this.sampleName = sampleName;
		this.sampleValue = sampleValue;
	}
	
	public long getSampleId() {
		return sampleId;
	}
	public void setSampleId(long sampleId) {
		this.sampleId = sampleId;
	}
	public String getSampleName() {
		return sampleName;
	}
	public void setSampleName(String sampleName) {
		this.sampleName = sampleName;
	}
	public double getSampleValue() {
		return sampleValue;
	}
	public void setSampleValue(double sampleValue) {
		this.sampleValue = sampleValue;
	}
	
	
}
