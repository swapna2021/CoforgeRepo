package com.coforge;

public class Employee extends Person {
	
	protected long empId;
	protected double salary;
	public Employee() {
		super();
	}
	
	public Employee(String name, int age, long empId, double salary) {
		super(name, age);
		this.empId = empId;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [name="+name +", age="+age+", empId=" + empId + ", salary=" + salary + "]";
	}
	
	

}
