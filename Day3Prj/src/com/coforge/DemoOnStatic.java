package com.coforge;

public class DemoOnStatic {
	
//	static {
//		System.out.println("my first static block");
//	}
//	
//	static {
//		System.out.println("second static block");
//	}
//	
	private String companyName="Coforge";
	
	
	public  void printName(String name) {
		
		System.out.println(name);
		System.out.println(this.companyName);
		
	}
	
	public static void main(String[] args) {
		
		System.out.println("inside main");
		
		DemoOnStatic dos=new DemoOnStatic();
		dos.printName("swapna");
		
		
		DemoOnStatic dos1=new DemoOnStatic();
		dos1.printName("Amit");
		
	}
	
//	static {
//		System.out.println("third static block");
//	}
//	
//	static {
//		System.out.println("4th block");
//	}

}
