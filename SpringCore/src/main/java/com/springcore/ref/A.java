package com.springcore.ref;

public class A {
	public A() {
		super();
		// TODO Auto-generated constructor stub
	}
	private int x;
	private B obj;
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public B getObj() {
		return obj;
	}
	public void setObj(B obj) {
		this.obj = obj;
	}
	public A(int x, B obj) {
		super();
		this.x = x;
		this.obj = obj;
	}
	@Override
	public String toString() {
		return "A [x=" + x + ", obj=" + obj + "]";
	}

	
}
