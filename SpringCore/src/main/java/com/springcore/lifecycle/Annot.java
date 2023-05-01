package com.springcore.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Annot {

	private int price;

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public Annot() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Annot [price=" + price + "]";
	}
	
	@PostConstruct
	public void init() {
		System.out.println("init method");
	}
	@PreDestroy
	public void destroy() {
		System.out.println("destroy method");
	}
}
