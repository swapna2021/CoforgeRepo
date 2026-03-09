package com.coforge;

import java.util.Enumeration;
import java.util.Vector;

public class DemoOnVectors {

	public static void main(String[] args) {
		
		Vector<Integer> vector=new Vector<Integer>();
		
		System.out.println(vector.capacity());
		vector.ensureCapacity(22);
		System.out.println(vector.capacity());
		
		
		vector.add(56);
		vector.add(44);
		vector.add(78);
		vector.add(32);
		vector.add(67);
		vector.add(56);
		vector.add(44);
		vector.add(78);
		vector.add(32);
		vector.add(67);
		vector.add(88);
		vector.add(56);
		vector.add(44);
		vector.add(78);
		vector.add(32);
		vector.add(67);
		vector.add(56);
		vector.add(44);
		vector.add(78);
		vector.add(32);
		vector.add(67);
		vector.add(90);
		
		System.out.println(vector.capacity());
		vector.add(89);
		System.out.println(vector.capacity());
//		Enumeration<Integer> enums=vector.elements();
//		
//		while(enums.hasMoreElements())
//			System.out.println(enums.nextElement());
//		vector.trimToSize();
//		System.out.println(vector.size());
//		System.out.println(vector.capacity());
//		
//		vector.add(90);
//		System.out.println(vector.capacity());
//		
		
		//practice on vector

	}

}
