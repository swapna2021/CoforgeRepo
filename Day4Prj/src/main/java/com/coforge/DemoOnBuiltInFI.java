package com.coforge;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class DemoOnBuiltInFI {

	public static void main(String[] args) {
		//Supplier
		
		Supplier<String> strSupplier=()->"Hello World".toUpperCase();
		System.out.println(strSupplier.get());
		
		
		Supplier<Double> randomSupplier=()->{
			double randomValue=Math.random();
			return randomValue;
		};
		System.out.println(randomSupplier.get());
		 
		 
		Supplier<Integer> otpSupplier=()->
		{
			 int otp=(int)(Math.random()*10000);
			 return otp;
		};
		System.out.println(otpSupplier.get());
		
		
		//Consumer
		
		Consumer<String> strConsumer=(str1)->System.out.println(str1.toUpperCase());
 		strConsumer.accept("swapna");
 		
 		Consumer<Integer> squareConsumer=(num)->System.out.println(num*num);
 		for(int i=1;i<=10;i++)
 			squareConsumer.accept(i);
 		
 		Consumer<Integer> factorialConsumer=(num)->{
 			int fact=1;
 			for(int i=1;i<=num;i++)
 				fact=fact*i;
 			System.out.println(fact);
 				
 		};
 		
 		factorialConsumer.accept(5);
		//Function
 		
 		Function<Integer,String> isEvenOrOdd=(num)->{
 			if(num%2==0)
 				return "even";
 			else
 				return "odd";
 		};
		
 		System.out.println(isEvenOrOdd.apply(572));
 		
 		Function<String, String> greet=(name)->"Hello "+name;
 		
 		System.out.println(greet.apply("Amit"));
 		
		//Predicate
 		
 		Predicate<Integer> checkNum=(num)->num%2==0;
 		if(checkNum.test(56))
 			System.out.println("Even number");
 		else
 			System.out.println("Odd Num");
 		
 		
 		Predicate<String> chkLength=(str)->str.length()>5;
 		System.out.println(chkLength.test("Swapna"));
 		
 		Predicate<String> authenticateUsername=(uname)->uname.equals("Swapna");
 		Predicate<String> authenticatePassword=(pwd)->pwd.equals("Swapna123");
 		String result=authenticateUsername.test("swapna")&&authenticatePassword.test("1234")
 				?"Authenticated successfull":"Invalid credentials";
 		System.out.println(result);
 		
 		
 		Predicate<String> validateUsername=(uname)->
 		uname.length()>3&&uname!=null&&!uname.isBlank();
 		
 		System.out.println(validateUsername.test("   A"));
 		
 		//validation rules
 		//username length must be more than 3 chars
 		//username can not be null
 		//username can not be blank
	}

}
