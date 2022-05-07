package com.esuyolu.jsfbasics.mvc;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
public class AdderBean {

	private int left;
	private int right;
	private int sum;
	
	public AdderBean() {
		
	}
	
	public int getLeft() {
		return left;
	}
	public void setLeft(int left) {
		this.left = left;
	}
	public int getRight() {
		return right;
	}
	public void setRight(int right) {
		this.right = right;
	}
	public int getSum() {
		return sum;
	}
	
	public void add() {
		sum = left + right;
	}
}
