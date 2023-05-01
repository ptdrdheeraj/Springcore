package com.springcore.collection;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Emp {

	private String name;
	private List<String> phones;
	private Set<String> courses;
	private Map<String,String> addresses;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<String> getPhones() {
		return phones;
	}
	public void setPhones(List<String> phones) {
		this.phones = phones;
	}
	public Set<String> getCourses() {
		return courses;
	}
	public void setCourses(Set<String> courses) {
		this.courses = courses;
	}
	public Map<String, String> getAddresses() {
		return addresses;
	}
	public void setAddresses(Map<String, String> addresses) {
		this.addresses = addresses;
	}
	public Emp(String name, List<String> phones, Set<String> courses, Map<String, String> addresses) {
		super();
		this.name = name;
		this.phones = phones;
		this.courses = courses;
		this.addresses = addresses;
	}
	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
