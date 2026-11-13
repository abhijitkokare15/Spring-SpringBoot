package com.spring;

public class Employee {
	private int eid;
	private String name;
	private String role;
	public Employee(int eid, String name, String role) {
		super();
		System.out.println("Welcome bback");
		this.eid = eid;
		this.name = name;
		this.role = role;
	}
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", name=" + name + ", role=" + role + "]";
	}
//	public Employee() {
//		super();
//		System.out.println("MY construcotr");
//	}
//	
	

}
