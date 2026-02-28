package com.coforge;

/* this is employee application */
public class EmployeeMain {

	public static void main(String[] args) {

		Employee e1 = new Employee("Swapna", 123, 70000);
		Employee e2 = new Employee("Amit", 124, 40000);
		Employee e3 = new Employee("Swathi", 125, 30000);
		e1.setCompanyName("Coforge Technologies");

		System.out.println(e1);
		System.out.println(e2);
		System.out.println(e3);

		e1.calSalary();
		e2.calSalary();
		e3.calSalary();

		Employee.printCompanyName();
	}
}
