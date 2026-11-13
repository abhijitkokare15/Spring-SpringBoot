package com.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	
	public static void main(String[]args)
	{
		ApplicationContext ap =new AnnotationConfigApplicationContext(Config.class);
		
		//System.out.println("I am here");
		
		Employee  Emp= ap.getBean(Employee.class);
		System.out.println(Emp);
	    
		  
		
	}

}
