package com.luv2code.springdemo;

public class KhoKhoCoach implements Coach {

	@Override
	public String getdailyWorkOut() {
		return "Play langdi for 30 min and 10 Rounds around the poll";
	}

	public void forInstantiates() {
		System.out.println("Spring Bean Life Cycle step 1 - Bean get Instantiates");
		System.out.println("Spring Bean Life Cycle step 2 - Dependancy Injection");
		System.out.println("Spring Bean Life Cycle step 3 - Spring internal processing");
		System.out.println("Spring Bean Life Cycle step 4 - Spring Bean is ready to use");
	}
	
	public void forDestroy() {
		System.out.println("Spring Bena life Cycle step 5 - Spring Bean Destroy.");
	}
	
}
