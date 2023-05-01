package com.springcore.SpringCore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        ApplicationContext context = new ClassPathXmlApplicationContext("Config.xml");
        Student std1= (Student) context.getBean("Student");
        
        Student std2 = (Student) context.getBean("student2");
        
        Student std3= (Student) context.getBean("student3");

        System.out.println(std1);
        System.out.println(std2);
        System.out.println(std3);
    }
}
