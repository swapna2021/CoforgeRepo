package com.coforge;

import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {
		
		int arr[]= {23,12,67,45,98,44};
		
		Scanner sc=new Scanner(System.in);
		int key=sc.nextInt();
		int i=0;
		for( ;i<arr.length;i++) 
			if(arr[i]==key) {
				System.out.println("Element found");
				break;
			}
		if(i==arr.length)
			System.out.println("not found");
	}

}
