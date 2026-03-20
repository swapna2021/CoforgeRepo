package com.coforge;

import com.coforge.dao.ItemDao;
import com.coforge.dao.OrderDao;
import com.coforge.entities.Item;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
    	
    	ItemDao dao=new ItemDao();
    	OrderDao ordDao=new OrderDao();
    	dao.getAllItems().forEach(item->System.out.println(item));
//    	dao.insertItem(new Item(4,"mouse",1000));
    	dao.getAllItems().forEach(item->System.out.println(item));
    	System.out.println(dao.getById(2));
    	ordDao.getAllOrders().forEach(ord->System.out.println(ord));
    	//complete menu driven code
    
    	
    	
    }
}
