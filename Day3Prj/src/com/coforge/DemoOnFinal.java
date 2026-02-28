package com.coforge;

public  class DemoOnFinal { //final class can't be extended
	
	protected final String name="swapna";//initialize immediately or initialize at object creation
	
	public final void printDetails() { //final methods can't be overridden
		//this.name="swapna";
		System.out.println(this.name);
	}
	
	public static void main(String[] args) {
		
		DemoOnFinal dof=new DemoOnFinal();
		dof.printDetails();
		
		final double pi=3.14;
		
		//pi=3.15;
		
		
		
	}

}
