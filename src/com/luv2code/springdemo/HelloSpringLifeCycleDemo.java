package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringLifeCycleDemo {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext CPXApplicationContext = new ClassPathXmlApplicationContext("applicationContext-springLifeCycle.xml");
		Coach coach = CPXApplicationContext.getBean("myKhoKhoCoach", Coach.class);
		
		System.out.println(coach.getdailyWorkOut()); 
		CPXApplicationContext.close();
		
	}

}
