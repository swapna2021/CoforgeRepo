package com.coforge;

public class Employee {
	
	private String name;
	private int id;
	private static String companyName="Coforge";
	private double bSalary;
	
	public Employee() {
		super();
	}
	public Employee(String name, int id,double bSalary) {
		super();
		this.name = name;
		this.id = id;
		this.bSalary = bSalary;
//		this.companyName = companyName;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String cName) {
		companyName = cName;
	}
	
	
	public double getSalary() {
		return bSalary;
	}
	public void setSalary(double bSalary) {
		this.bSalary = bSalary;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + ", salary=" + bSalary + "]";
	}
	
	
	public void calSalary() {
		
		double netSal;
		
		if(this.bSalary>50000) {
			double hra=0.10;
			double da=0.10;
			netSal=bSalary+bSalary*hra+bSalary*da;
		}
		else
		{
			netSal=bSalary;
		}
		
		System.out.println("Net Salary:"+netSal);
		
	}
	
	
	public static void printCompanyName() {
		
		System.out.println(companyName);
	}
	

}
