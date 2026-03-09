package com.coforge;

public class Manager extends Employee {
	
	private String dept;

	public Manager() {
		super();
	}

	public Manager(String name, int age, long empId, double salary, String dept) {
		super(name, age, empId, salary);
		this.dept = dept;
	}

	@Override
	public String toString() {
		return "Manager [name="+name +", age="+age+", empId=" + empId + ", salary=" + salary +", dept=" + dept + "]";
	}
	
	
	

}
