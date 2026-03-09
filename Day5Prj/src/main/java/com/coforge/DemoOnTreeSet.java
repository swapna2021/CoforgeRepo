package com.coforge;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;
public class DemoOnTreeSet {

	public static void main(String[] args) {
		
		TreeSet<Student> studentTree=new TreeSet<Student>();
		Student s1=new Student(123,"swapna",90);
		Student s2=new Student(234, "pooja", 79);
		Student s3=new Student(1231,"swathi",80);
		Student s4=new Student(2341, "poojasri", 89);
		Student s5=new Student(1232,"swetha",60);
		Student s6=new Student(2342, "prem", 69);
		
		studentTree.add(s1);
		studentTree.add(s2);
		studentTree.add(s3);
		studentTree.add(s4);
		studentTree.add(s5);
		studentTree.add(s6);
		
		studentTree.forEach(s-> System.out.println(s));
//		System.out.println("--------------------------------");
//		Iterator<Student> itr=studentTree.iterator();
//		while(itr.hasNext())
//			System.out.println(itr.next());
		System.out.println("--------------------------------");
		Iterator<Student> itr=studentTree.descendingIterator();
		while(itr.hasNext())
			System.out.println(itr.next());
		System.out.println("--------------------------------");
		System.out.println("descending set");
		Set<Student> set=studentTree.descendingSet();
		set.forEach(s-> System.out.println(s));
		
		Student fromStud=new Student(123,"",0);
		Student toStud=new Student(1232,"",0.0);
		Set<Student> subset=studentTree.subSet(fromStud, toStud);
		System.out.println("--------------------------------");
		System.out.println("Subset of student tree");
		subset.forEach(s-> System.out.println(s));
		System.out.println("--------------------------------");
		studentTree.forEach(s-> System.out.println(s));
		System.out.println("--------------------------------");
		Student s=new Student(2342,"",90);
		System.out.println(studentTree.ceiling(s));
		System.out.println(studentTree.floor(s));
		System.out.println(studentTree.higher(s));
		
		
	}
}
