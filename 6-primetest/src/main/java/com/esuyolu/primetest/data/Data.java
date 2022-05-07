package com.esuyolu.primetest.data;

public class Data {
	private long dataId;
	private String dataName;
	private double dataValue;
	
	public Data() {}

	public Data(long dataId, String dataName, double dataValue) {
		super();
		this.dataId = dataId;
		this.dataName = dataName;
		this.dataValue = dataValue;
	}

	public long getDataId() {
		return dataId;
	}

	public void setDataId(long dataId) {
		this.dataId = dataId;
	}

	public String getDataName() {
		return dataName;
	}

	public void setDataName(String dataName) {
		this.dataName = dataName;
	}

	public double getDataValue() {
		return dataValue;
	}

	public void setDataValue(double dataValue) {
		this.dataValue = dataValue;
	}
}
