package com.springcore.ci;

public class Addition {
	
	private int a;
	private int b;
	
	public Addition(double a, double b) {
		this.a=(int)a;
		this.b=(int)b;
		System.out.println("double constructor ");
	}
	public Addition(int a, int b) {
		this.a=a;
		this.b=b;
		System.out.println("integer constructor ");
	}
	
	public Addition(String a, String b) {
		this.a=Integer.parseInt(a);
		this.b=Integer.parseInt(b);
		System.out.println("string constructor ");
	}
	
	public void doAdd() {
		System.out.println("Add is " +(this.a + this.b));
	}

}
