package com.coforge;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class DemoOnLinkedList {
	
	public static void main(String[] args) {
		
		LinkedList<Integer> llist=new LinkedList<Integer>();
		llist.add(78);
		llist.add(34);
		llist.add(23);
		llist.add(67);
		llist.add(10);
		System.out.println(llist);
		
		llist.addFirst(55);
		llist.addLast(77);
		System.out.println(llist);
		
		
		System.out.println(llist.element());
		
		LinkedList<Integer> llist1=new LinkedList<Integer>();
		llist1.add(78);
		llist1.add(34);
		llist1.add(23);
		llist1.add(67);
		llist1.add(10);
		llist1.addFirst(55);
		llist1.addLast(77);
		
		System.out.println(llist.equals(llist1));
		
		Iterator<Integer> itr=llist.descendingIterator();
		while(itr.hasNext())
			System.out.println(itr.next());
		
		//Create employee linked list with 10 records
		//sort using Collection.sort on salary based
		//Sort using comparators ,Branch,dept,name,salary
		// ename,eid,salary,dept,branch
		
		
	}

}
