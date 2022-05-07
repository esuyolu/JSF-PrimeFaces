package com.esuyolu.primetest.data;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named
@RequestScoped
public class DataBean {
	private List<Data> dataList;
	@Inject
	private DataRepository dataRepository;
	
	@PostConstruct
	public void initialize() {
		dataList = dataRepository.selectList();
	}
	
	public List<Data> getDataList() {
		return dataList;
	}
}
