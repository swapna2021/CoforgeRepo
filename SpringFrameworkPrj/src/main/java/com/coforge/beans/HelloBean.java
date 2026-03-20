package com.coforge.beans;

public class HelloBean {
	
	private String name;
	
	@Override
	public String toString() {
		return "HelloBean [name=" + name + "]";
	}


//	public String getName() {
//		return name;
//	}
//
//
//	public void setName(String name) {
//		this.name = name;
//	}


	public HelloBean(String name) {
		super();
		this.name = name;
	}


	public HelloBean() {
		super();
	}


	public void sayHello() {
		System.out.println("Hello....");
	}
	
	
	public void printName() {
		
		System.out.println(this.name);
	}

}
