package com.coforge.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.List;

import com.coforge.dao.CustomerDAO;
import com.coforge.entities.Customer;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CustomerServlet
 */
@WebServlet("/CustomerServlet")
public class CustomerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private static CustomerDAO dao=null;
   
    public CustomerServlet() {
        
    }

    @Override
    public void init() throws ServletException {
    	 dao=new CustomerDAO();
    }
    
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		String action=request.getParameter("action");
		
		switch(action) {
		
		case "select": try {
			getAllCustomer();
		}
		catch (SQLException |ClassNotFoundException e) {
			
		}
		break;
			
		case "insert":
			String res=null;
			try {
				res = addCustomer();
				out.println("data retrieved on console");
			} catch (ClassNotFoundException | SQLException e) {
				e.printStackTrace();
			}
			out.println(res);
		break;
		case "getbyid":
			try {
				out.println(getCustomerById());
			} catch (ClassNotFoundException | SQLException e) {
				e.printStackTrace();
			}
			break;
		}


	}
	
	public void getAllCustomer() throws ClassNotFoundException, SQLException{
		
		 List<Customer> customerList= dao.getAllCustomers();
		 customerList.forEach(c->System.out.println(c));
		
	}
	
	public String addCustomer() throws ClassNotFoundException, SQLException {
		
		Customer customer=new Customer(237,"Amit","Bangalore","amit@gmail.com","9090909090");
		return dao.addCustomer(customer);
		
	}
	
	public Customer getCustomerById() throws ClassNotFoundException, SQLException {
		
		return dao.getCustomerById(123l);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
