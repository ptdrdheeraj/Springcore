package com.springcore.spel;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Demo {
	@Value("#{5+6}")
	private int x;
	
	@Value("#{5>9?67:76}")
	private int y;
	
	@Value("#{T(java.lang.Math).sqrt(25)}")
	private int a;
	
	@Value("#{new java.lang.String('DHEERU')}")
	private String name;
	
	@Value("#{8>7}")
	private boolean isActive;
	
	
	
	
	
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	@Override
	public String toString() {
		return "Demo [x=" + x + ", y=" + y + ", a=" + a + ", name=" + name + ", isActive=" + isActive + "]";
	}
	


	
}
