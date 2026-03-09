package com.coforge;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.function.Predicate;

public class DemoOnHashSet {
	
	public static void main(String[] args) {
		
//		HashSet<Integer> hset=new HashSet<Integer>();
//		hset.add(78);
//		hset.add(33);
//		hset.add(90);
//		hset.add(12);
//		
//		System.out.println(hset);
//		
//		hset.add(90);
//		System.out.println(hset);
//		//hset.add(null);
//		System.out.println(hset);
//		
//		for(Integer i:hset)
//		System.out.println(i);
//		Predicate<Integer> isEven=(e)->e%2==0;
//		hset.removeIf(isEven);
//		System.out.println(hset);
		
		LinkedHashSet<Integer> lset=new LinkedHashSet<Integer>();
		lset.add(78);
		lset.add(33);
		lset.add(90);
		lset.add(12);
		System.out.println(lset);
		
		
		Iterator<Integer> itr=lset.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());
	
		
		
	}

}
