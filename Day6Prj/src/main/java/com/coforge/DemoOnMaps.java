package com.coforge;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class DemoOnMaps {

	public static void main(String[] args) {
		
		HashMap<Integer,String> hashMap=new HashMap<Integer, String>();
		hashMap.put(1, "Swapna");//entry
		hashMap.put(5, "Smit");
		hashMap.put(3, "Rahul");
		hashMap.put(7, "Swapna");
		
		System.out.println(hashMap);
		for(Integer key:hashMap.keySet())
			System.out.println(key);
		for(String val:hashMap.values())
			System.out.println(val);
//		hashMap.put(null,"amit");
//		System.out.println(hashMap);
		
		System.out.println(hashMap.containsKey(5));
		System.out.println(hashMap.containsValue("Smit"));
		Set<Entry<Integer, String>> entrySet= hashMap.entrySet();
		System.out.println(entrySet);
		
		
		Iterator<Entry<Integer, String>> itr=entrySet.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());
		System.out.println(hashMap.get(5));
		
		
		TreeMap<Integer, String> fruitTree=new TreeMap<Integer, String>();
		fruitTree.put(1, "Apple");
		fruitTree.put(3, "Banana");
		fruitTree.put(5, "Mango");
		fruitTree.put(2, "Papaya");
		fruitTree.put(4, "Watermelon");
		
		System.out.println(fruitTree);
		
		for(Integer key:fruitTree.keySet())
			System.out.println(key+"--->"+fruitTree.get(key));
	

	}

}
