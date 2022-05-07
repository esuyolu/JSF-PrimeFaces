package com.esuyolu.primetest.data;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named
@RequestScoped
public interface DataRepository {

	List<Data> selectList();
}
