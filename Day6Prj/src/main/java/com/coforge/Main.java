package com.coforge;

import java.util.HashSet;
import java.util.Scanner;

public class Main {
	
	static HashSet<Employee>  empSet=new HashSet<Employee>();
	
	static {
		
		empSet.add(new Employee(123,"swapna",80000));
		empSet.add(new Employee(124,"swetha",70000));
		empSet.add(new Employee(125,"srija",90000));
		empSet.add(new Employee(126,"swathi",60000));
	}

	public static void main(String[] args) {
		
		//Read operation
		empSet.forEach(e->System.out.println(e));
		//create or insert
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter employee details empId,empName,salary");
		Employee emp=new Employee(sc.nextLong(),sc.next(),sc.nextDouble());
		empSet.add(emp);
		//update
		System.out.println("Enter employee id for updation");
		long id=sc.nextLong();
		if(empSet.contains(emp.getEmpId())) {
			
		}
		//delete
		
		
	}

}
