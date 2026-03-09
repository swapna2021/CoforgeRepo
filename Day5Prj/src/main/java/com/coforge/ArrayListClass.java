package com.coforge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayListClass {

	public static void main(String[] args) {
		
//		ArrayList alist=new ArrayList();
//		alist.add("swapna");
//		alist.add(56);//wrapped by Wrapper class Integer
//		alist.add(true);
//		alist.add(78.96);
//		alist.add(45.67f);
//		alist.add('S');
//		
//		for(int i=0;i<alist.size();i++)
//			System.out.println(alist.get(i));
//		
//		System.out.println("-----------------------");
//		alist.add("swapna");
//		alist.add(56);//wrapped by Wrapper class Integer
//		alist.add(true);
//		alist.add(78.96);
//		alist.add(45.67f);
//		alist.add('S');
//		for(int i=0;i<alist.size();i++)
//			System.out.println(alist.get(i));
//		System.out.println("-----------------------");
//		alist.add(null);
//		alist.add(null);
//		for(int i=0;i<alist.size();i++)
//			System.out.println(alist.get(i));
//		
//		System.out.println(alist);
//		
		
		ArrayList<Integer> intAlist=new ArrayList<Integer>();
		intAlist.add(54);
		intAlist.add(90);
		intAlist.add(36);
		intAlist.add(134);
		intAlist.add(33);
		intAlist.add(349);
		//intAlist.add(null);
//		System.out.println(intAlist);
//		
//		for(int i=0;i<intAlist.size();i++)
//			System.out.println(intAlist.get(i));
//		
//		for(Integer i:intAlist)
//			System.out.println(i);
		
//		Integer iobj=567;
//		int i1=iobj.intValue(); --- unboxing
		
		System.out.println("*********************");
//		Iterator<Integer> itr=intAlist.iterator();
//		while(itr.hasNext()) {
//			Integer i=itr.next();
//			if(i==34)
//				itr.remove();
//			System.out.println(i);
//		}
//		System.out.println("After iteration arraylist is:");
//		System.out.println(intAlist);
//		System.out.println("Forward direction list values");
//		ListIterator<Integer> listItr=intAlist.listIterator();
//		while(listItr.hasNext())
//			System.out.println(listItr.next());
//		
//		System.out.println("Reverse direction of list values");
//		while(listItr.hasPrevious())
//			System.out.println(listItr.previous());
//			
		
		ArrayList<Integer> alist=new ArrayList<Integer>();
		alist.add(54);
		alist.add(33);
		alist.add(98);
		alist.add(0,11);
		System.out.println(alist);
//		intAlist.addAll(3,alist);
//		System.out.println("After add all method");
//		System.out.println(intAlist);
//		
//		System.out.println(intAlist);
//		intAlist.remove(2);
//		System.out.println(intAlist);
//		Integer i=134;
//		intAlist.remove(i);
//		System.out.println(intAlist);
//		
		
//		intAlist.removeAll(alist);
//		System.out.println("After removeall collection");
//		System.out.println(intAlist);
//		System.out.println(alist);
		

//		intAlist.replaceAll(e->e+10);
//		System.out.println(intAlist);
		
//		System.out.println("Before clear"+alist);
//		alist.clear();
//		System.out.println("After clear"+alist);
//		Integer i=999;
//		intAlist.addFirst(i);
//		System.out.println(intAlist);
		
		
//		ArrayList<Integer> clonedArrayList=(ArrayList<Integer>) alist.clone();
//		System.out.println(clonedArrayList);
//		
//		System.out.println(alist.hashCode());
//		System.out.println(clonedArrayList.hashCode());
		
//		clonedArrayList.add(78);
//		alist.add(67);
//		System.out.println(alist);
//		System.out.println(clonedArrayList);
//		System.out.println(alist.hashCode());
//		System.out.println(clonedArrayList.hashCode());
//		
//		System.out.println(alist.contains(67));
//		System.out.println(alist.containsAll(intAlist));
		
//		alist.forEach(e->System.out.println(e));
//		System.out.println(alist.indexOf(98));
//		intAlist.retainAll(alist);
//		System.out.println(intAlist);
//		
//		System.out.println(alist.toString().getClass());
		
		
		Collections.sort(alist);
		System.out.println(alist);
		
		//Object[] obj= alist.toArray();
		Integer[] irr=alist.toArray(new Integer[0]);
		System.out.println(irr[2]);
		
		Integer[] arr= {34,56,32,43,76,87};
		List<Integer> list=Arrays.asList(arr);
		
	}

}
