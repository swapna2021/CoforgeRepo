package com.coforge.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.coforge.entities.Customer;
import com.coforge.utils.DBUtil;

public class CustomerDAO {
	
	public List<Customer> getAllCustomers() throws ClassNotFoundException, SQLException{
		
		List<Customer> custList=new ArrayList<Customer>();
		String query="select * from customer";
		Connection con=DBUtil.getConnection();
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery(query);
		
		while(rs.next())
		{
			Customer customer=new Customer();
			customer.setCustId(rs.getLong("custid"));
			customer.setCustName(rs.getString("custname"));
			customer.setAddress(rs.getString("address"));
			customer.setEmail(rs.getString("email"));
			customer.setMobile(rs.getString("mobile"));
			custList.add(customer);
		}
		rs.close();
		st.close();
		con.close();
		return custList;
		
		
	}
	
	public String addCustomer(Customer customer) throws ClassNotFoundException, SQLException {
		
		Connection con=DBUtil.getConnection();
		String query="insert into customer values (?,?,?,?,?)";
		PreparedStatement ps=con.prepareStatement(query);
		ps.setLong(1,customer.getCustId());
		ps.setString(2,customer.getCustName());
		ps.setString(3, customer.getAddress());
		ps.setString(4,customer.getEmail());
		ps.setString(5, customer.getMobile());
		
		ps.executeUpdate();
		ps.close();
		con.close();
		return "customer added successfully";
		
		
	}
	
	public Customer getCustomerById(long custId) throws ClassNotFoundException, SQLException {
		
		Connection con=DBUtil.getConnection();
		String query="select * from customer where custid=?";
		PreparedStatement ps=con.prepareStatement(query);
		ps.setLong(1,custId);
		ResultSet rs=ps.executeQuery();
		Customer  customer=new Customer();
		while(rs.next())
		{
			customer.setCustId(rs.getLong("custid"));
			customer.setCustName(rs.getString("custname"));
			customer.setAddress(rs.getString("address"));
			customer.setEmail(rs.getString("email"));
			customer.setMobile(rs.getString("mobile"));
		}
		return customer;
	}

}
