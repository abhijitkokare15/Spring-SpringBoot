package com.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class AnimeBroadcast {
	
	
//	@Autowired()
	//@Qualifier("naruto")
	private  AnimePublication ap;
	
	@Autowired()
	@Qualifier("naruto")
	public void setAp(AnimePublication ap) {
		System.out.println("THis is a setter injection");
		this.ap = ap;
		
	}

	public AnimeBroadcast() {
		super();
		System.out.println("THis is a construcotr injection -2 ");
		
	}
	
	public void show()
	{
		ap.publish();
	}
	
	
	
	
//	@Autowired()
	public AnimeBroadcast( /*@Qualifier("naruto")*/ AnimePublication ap) {
		
		super();
		System.out.println("THis is a construcotr injection");
		this.ap = ap;
		ap.publish();
	}


	
	
	
	
	
}



	

	
