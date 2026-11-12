package com.spring;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary 
public class Naruto implements AnimePublication {
	public Naruto()
	{
		System.out.println("The naruto is comming");
		
	}
	
	public void publish()
	{
		System.out.println("Naruto  is broadcasted..");
	}
	
	

}
