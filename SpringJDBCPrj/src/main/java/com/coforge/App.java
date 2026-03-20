package com.coforge;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.coforge.config.AppConfig;
import com.coforge.dao.EmployeeDao;
import com.coforge.entities.Employee;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        
    	AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
    	EmployeeDao dao=context.getBean(EmployeeDao.class);
//    	Employee emp=new Employee(321,"neeraj",60000.0);
//    	dao.insertEmployee(emp);
    	System.out.println("Get All Employees");
    	dao.getAllEmployees().forEach(e->System.out.println(e));
    	System.out.println("-----------------------");
    	System.out.println("retrieving one record using getEmployeeById");
    	System.out.println(dao.getEmployeeById(123));
    	System.out.println("-----------------------");
//    	Employee upEmp=new Employee(80000);
//    	dao.updateEmployee(321, upEmp);
    	
    	dao.deleteEmployee(321l);
    	System.out.println("-----------------------");
    	System.out.println("Get All Employees");
    	dao.getAllEmployees().forEach(e->System.out.println(e));
    	
    	context.close();
    	
    	//6281614948--swapna
    	
    }
}
