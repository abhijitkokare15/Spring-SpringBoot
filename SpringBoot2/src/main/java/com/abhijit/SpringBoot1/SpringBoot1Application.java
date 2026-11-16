package com.abhijit.SpringBoot1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.abhi.CrunchyRoll;

@SpringBootApplication(scanBasePackages={"in.abhi","ac.abhi"})
public class SpringBoot1Application {
        
	public static void main(String[] args) {
		ConfigurableApplicationContext con =  SpringApplication.run(SpringBoot1Application.class, args);
		
		CrunchyRoll cr = con.getBean(CrunchyRoll.class);
		cr.telecast();
	}

}
