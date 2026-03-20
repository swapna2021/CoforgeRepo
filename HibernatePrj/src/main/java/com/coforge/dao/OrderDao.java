package com.coforge.dao;

import java.util.List;

import org.hibernate.Session;

import com.coforge.entities.Order;
import com.coforge.util.HibernateUtil;

public class OrderDao implements OrderDaoInterface{

	@Override
	public List<Order> getAllOrders() {
		
		try(Session session=HibernateUtil.buildSessionFactory().openSession()){
			return session.createQuery("From Order",Order.class).list();
		}
		
	}

}
