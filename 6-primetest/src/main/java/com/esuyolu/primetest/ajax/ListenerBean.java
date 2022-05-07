package com.esuyolu.primetest.ajax;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named
@RequestScoped
public class ListenerBean {
	
	private List<String> subjectList;
	private String subject;
	private String subSubject;
	
	@PostConstruct
	public void initialize() {
		subjectList = new ArrayList<String>();
		subjectList.add("Java");
		subjectList.add("C#");
		subjectList.add("PHP");
		subjectList.add("Python");
		subjectList.add("C++");
	}
	
	public List<String> getSubjectList() {
		return subjectList;
	}
	
	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	public String getSubSubject() {
		return subSubject;
	}

	public void handleSubjectChange() {
		System.out.println("Konu: \n" + subject);
		subSubject = subject + " ile ilgili konular";
	}
}
