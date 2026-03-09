package com.coforge;

import java.util.ArrayList;
import java.util.Collections;

public class CustomerArrayList {
	
	public static void main(String[] args) {
		
		Customer c1=new Customer(1,"swapna","Hyd",56000);
		Customer c2=new Customer(54,"amit","bglr",30000);
		Customer c3=new Customer(11,"swapna","bglr",17000);
		Customer c4=new Customer(55,"raj","Hyd",80000);
		Customer c5=new Customer(16,"swathi","Hyd",6000);
		Customer c6=new Customer(34,"pooja","bglr",45000);
		
		ArrayList<Customer> custList=new ArrayList<Customer>();
		custList.add(c1);
		custList.add(c2);
		custList.add(c3);
		custList.add(c4);
		custList.add(c5);
		custList.add(c6);
		
//		Collections.sort(custList);
		custList.sort(new CityComparator()
				.thenComparing(new OrderCostComaprator()));
		
		custList.forEach(cust->System.out.println(cust));
		
	}

}







