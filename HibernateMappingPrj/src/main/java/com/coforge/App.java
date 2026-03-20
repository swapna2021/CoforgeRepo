package com.coforge;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.coforge.dao.EmployeeDao;
import com.coforge.entities.Address;
import com.coforge.entities.Customer;
import com.coforge.entities.Employee;
import com.coforge.entities.Order;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
//        System.out.println("Hello World!");
//        EmployeeDao dao=new EmployeeDao();
        
//        Address address=new Address("Hyd","Telangana","500092");
//        Employee emp=new Employee("swapna","swapna@gmail.com","6281614948",address);
//        dao.insertEmployee(emp);
//        dao.getAllEmployee().forEach(e->System.out.println(e));
//        if(dao.getEmployeeById(3)!=null)
//        System.out.println(dao.getEmployeeById(3));
//        else
//        	System.out.println("No Employee found with this id");
//        
//        
//        dao.deleteEmployee(2);
        
        	SessionFactory sf=new Configuration().configure().buildSessionFactory();
        	Session session=sf.openSession();
        	
        	ArrayList<Order> ordList=new ArrayList<Order>();
        	ordList.add(new Order("Laptop",80000));
        	ordList.add(new Order("Mobile",70000));
        	
        	
        	Customer customer=new Customer("Swapna","Hyderabad",ordList);
        	Transaction tx=session.beginTransaction();
        	session.persist(customer);
        	tx.commit();
        	
        	session.createQuery("From Customer",Customer.class)
        	.list()
        	.forEach(c->System.out.println(c));
        
    }
}
