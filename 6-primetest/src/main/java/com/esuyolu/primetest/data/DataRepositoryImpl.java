package com.esuyolu.primetest.data;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

public class DataRepositoryImpl implements DataRepository {
	
	private List<Data> dataList;
	
	@PostConstruct
	public void initialize() {
		int length = 93;
		dataList = new ArrayList<Data>();
		for (int i = 0; i < length; ++i) {
			dataList.add(new Data(i+1, "Veri " + (i + 1), 0.1 * (i + 1)));
		}
	}
	
	@Override
	public List<Data> selectList() {
		return dataList;
	}
}
