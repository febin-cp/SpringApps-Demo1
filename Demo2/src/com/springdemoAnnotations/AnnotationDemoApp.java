package com.springdemoAnnotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Coach theCoach = context.getBean("SillyCoach", Coach.class);
		System.out.println(theCoach.getDailyWorkOut());
		System.out.println(theCoach.getFortuneService());
		context.close();
	}
}
