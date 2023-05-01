package com.springcore.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {

	@Bean(name = "samosa1") /* we can put multiple name using , */
	public Samosa getSamosa() {
		return new Samosa();
	}
	
	@Bean
	public Student getStudent() {
		Student s1 = new Student(getSamosa());
		
		return s1;
	}
	
	
}
