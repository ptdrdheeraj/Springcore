package com.springcore.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test1 {

	public static void main(String[] args) {

	 ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/stereotype/Stereoconfiguration.xml");
	
	 Student s1 = context.getBean("obj",Student.class);// obj is a custom variable defined @ component("obj") annot.
	 
	 System.out.println(s1.hashCode());
		/*
		 * System.out.println(s1.getPhones()); System.out.println("_____________");
		 * System.out.println(s1.getPhones().getClass().getName());
		 */
	 Student s2 = context.getBean("obj",Student.class);
	 System.out.println(s2.hashCode());
	 
	 System.out.println("_______________________");
	 
	 Teacher t1 = context.getBean("teacher",Teacher.class);
	 Teacher t2 = context.getBean("teacher",Teacher.class);
	 
	 System.out.println(t1.hashCode());

	 System.out.println(t2.hashCode());
	}

}
