package com.spring;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.spring")
public class Config {

	public Config() {
		super();
		 System.out.println("Constrcutor is created...");
	}
	
	
	         
//	          @Bean("Emp1")
//	
//			public Employee emp()
//			{
//				return new Employee();
//			}
	          
	          
	          
	          @Bean()
	          public LocalDate ld()
	          {
	        	  return  LocalDate.now();
	          }
	

}
