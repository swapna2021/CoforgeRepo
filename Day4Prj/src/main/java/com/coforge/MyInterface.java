package com.coforge;
@FunctionalInterface
public interface MyInterface {
	
	
	public void display();
	
	public default void printDetails() {
		
		System.out.println("default method of MyInterface invoked");
		
	}
	
	public static void  useParking(String compName) {
		System.out.println(compName + "using pariking area");
	}

}
