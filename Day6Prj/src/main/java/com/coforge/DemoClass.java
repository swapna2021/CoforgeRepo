package com.coforge;

public class DemoClass {
	
//	public static void calculate() {
//		int a=5,b=0;
//		if(b==0)
//			throw new ArithmeticException();
//		else
//			System.out.println(a/b);
//	}
	
	public static void checkAge(int age) throws AGeNotSufficientException {
		if(age>15)
			System.out.println("Eligible to register plus two");
		else
			
			throw new AGeNotSufficientException("age is lessthan 15");
	}
	
	public static void main(String[] args)  {
//		try {
//		calculate();
//		}
//		catch(ArithmeticException e) {
//			e.printStackTrace();
//		}
		try {
		checkAge(13);
		}
		catch(AGeNotSufficientException ex) {
			System.out.println("inside catch "+ex.getMessage());
		}

		System.out.println("Application completed");
		
		
	}
	
	


}
