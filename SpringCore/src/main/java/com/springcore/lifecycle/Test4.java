package com.springcore.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test4 {

	public static void main(String[] args) {

		AbstractApplicationContext context = new ClassPathXmlApplicationContext(
				"com/springcore/lifecycle/LcConfiguration.xml");

		context.registerShutdownHook();

		/*
		 * Samosa s1 = (Samosa) context.getBean("s1"); System.out.println(s1);
		 */
		System.out.println("************************");

		/*
		 * Pepsi p1 = (Pepsi) context.getBean("p1"); System.out.println(p1);
		 */
		Annot annot = (Annot) context.getBean("Annot");

		System.out.println(annot);
		
	}

}
