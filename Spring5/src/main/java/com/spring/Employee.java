package com.spring;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Employee {
	@Value("101")
	private int eid;
	@Value("Navin")
	private String name;
	@Value("Java Engg.")
	private String role;
	
	@Autowired
	private LocalDate dt;
	
	public Employee(int eid, String name, String role) {
		super();
		System.out.println("Welcome bback");
		this.eid = eid;
		this.name = name;
		this.role = role;
	}
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", name=" + name + ", role=" + role + " Year :"+dt.getYear()+"]";
	}
	
	public Employee() {
		super();
		System.out.println("MY construcotr");
	}
	
	
	
//	
	

}
