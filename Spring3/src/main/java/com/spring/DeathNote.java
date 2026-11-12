package com.spring;

import org.springframework.stereotype.Component;

@Component
public class DeathNote implements AnimePublication {

	public DeathNote() {
		super();
	System.out.println("Death note is comming");
	
	}
	
	
	
	public void publish()
	{
		System.out.println("Death note is broadcasted...");
	}
	

}
