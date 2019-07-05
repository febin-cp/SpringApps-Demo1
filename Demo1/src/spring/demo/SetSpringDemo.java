package spring.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetSpringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		CricketCoach theCoach = context.getBean("myCricketCoach",CricketCoach.class);
		
		System.out.println(theCoach.getDailyWorkOut());
		System.out.println(theCoach.getFortune());
		System.out.println(theCoach.getClass());
		context.close();
	}

}
