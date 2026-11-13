package com.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	
	public static void main(String[]args)
	{
		ApplicationContext ap =new ClassPathXmlApplicationContext("app.xml");
		 Employee e2 = ap.getBean("emp2", Employee.class);
		System.out.println(e2);
	
		
		
		
	}

}
