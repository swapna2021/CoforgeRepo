package com.coforge;

public class CalculatorApp {

//	@Override
//	public void add(int a, int b) {
//		System.out.println("Sum : "+(a+b));
//		
//	}
	
	public static void main(String[] args) {
		//passing parameters to lambda and no return 
//		CalculatorInterface ca=(a,b)->System.out.println("Sum : "+(a+b));
//		ca.add(67, 54);
		
		
		//passing parameters and having return
//		CalculatorInterface ca=(a,b)->a-b;
//		System.out.println("Result : "+ ca.sub(67,34));
		
//		CalculatorInterface ca=()->{
//			int a=6,b=9;
//			return a*b;
//		};
//		System.out.println("Result : "+ ca.mul());
		
		
		CalculatorInterface ca=()->{
			float a=72, b=4;
			System.out.println("Result : "+a/b);
		};
		
		ca.div();
		
		
	}

}
