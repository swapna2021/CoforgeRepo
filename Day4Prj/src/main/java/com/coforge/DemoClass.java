package com.coforge;

public class DemoClass implements MyInterface {

	@Override
	public void display() {
		
		System.out.println("from display method of Democlass");
		
	}
	
	@Override
	public void printDetails() {
		System.out.println("print details of democlass");
	}

}
