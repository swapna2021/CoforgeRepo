package com.coforge;

import java.util.Scanner;

public class DemoOnArrays {
	
	
	public static void main(String[] args) {
		
		int arr[]=new int[5];
		Scanner sc=new Scanner(System.in);
		System.out.println("enter elements");
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
			sum+=arr[i];
		}
		System.out.println(sum);
			
		
//		System.out.println("Even Numbers of an array");
//		for(int i=0;i<arr.length;i++)
//			if(arr[i]%2==0)
//			System.out.println(arr[i]);
		
	}

}
