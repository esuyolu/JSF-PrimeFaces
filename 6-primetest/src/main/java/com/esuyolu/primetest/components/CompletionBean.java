package com.esuyolu.primetest.components;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean
@ViewScoped
public class CompletionBean {
	private List<String> wholeList;
	private String myText;
	private Locale turkish = new Locale("tr", "TR");
	
	public CompletionBean() {
		wholeList = new ArrayList<String>();
		wholeList.add("Türkiye");
		wholeList.add("Azerbeycan");
		wholeList.add("Kazakistan");
		wholeList.add("Kırgizistan");
		wholeList.add("Özbekistan");
		wholeList.add("Türkmenistan");
	}
	
	public List<String> getWholeList() {
		return wholeList;
	}
	
	public String getMyText() {
		return myText;
	}

	public void setMyText(String myText) {
		this.myText = myText;
	}

	public List<String> suggest(String query) {
		List<String> suggestionList = new ArrayList<String>();
		
		for (String whole : wholeList) {
			if (whole.toLowerCase(turkish).startsWith(query.toLowerCase(turkish))) {
				suggestionList.add(whole);
			}
		}
		
		return suggestionList;
	}
}
