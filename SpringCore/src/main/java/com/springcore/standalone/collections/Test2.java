package com.springcore.standalone.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test2 {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/standalone/collections/StandConfiguration.xml");
		
		Person p1 = (Person) context.getBean("person1");
		
		System.out.println(p1);
		System.out.println(p1.getFriends().getClass().getName());
		System.out.println("________________________________");
		System.out.println(p1.getFeestructures().getClass().getName());
		System.out.println("________________________________");
        System.out.println(p1.getProperties());
		
		
		
		
	}

}
