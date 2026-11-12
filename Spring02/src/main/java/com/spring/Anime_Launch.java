package com.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Anime_Launch {
	
	@Bean
	public static void main( String[]args)
	{
		ApplicationContext ac = new ClassPathXmlApplicationContext("app.xml");
		
		DeathNote d = new DeathNote();
		
		DeathNote dn  = ac.getBean(DeathNote.class);
		dn.show();
		
		
		
		
		
	}
	
	
	
}
