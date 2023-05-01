package com.springcore.javaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DemoMain {

	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);

		Student s1 = context.getBean("getStudent", Student.class); /* key is a method name at javaconfig class */
		
		/*
		 * System.out.println(s1);
		 */		
		s1.study();
		
		Samosa sa1 = context.getBean("samosa1",Samosa.class);
		System.out.println(sa1);
		sa1.display();
		
	}

}
