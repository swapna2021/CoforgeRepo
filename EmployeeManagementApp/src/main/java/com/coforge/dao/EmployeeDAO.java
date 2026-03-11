package com.coforge.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.coforge.models.Employee;
import com.coforge.util.DBUtil;

public class EmployeeDAO {
	
	
	public List<Employee> getAllEmployees() {
		String query="select * from employee";
		List<Employee> empList=new ArrayList<Employee>();
		try(Connection con=DBUtil.getConnection();
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery(query)){
			
			
			while(rs.next()) {
				Employee e=new Employee();
				e.setEid(rs.getLong("eid"));
				e.setEname(rs.getString("ename"));
				e.setSalary(rs.getDouble("salary"));
				e.setEmail(rs.getString("email"));
				e.setMobile(rs.getString("mobile"));
				e.setDoj(rs.getDate("doj").toLocalDate());
				e.setDob(rs.getDate("dob").toLocalDate());
				empList.add(e);
			}
			
			}
			catch (ClassNotFoundException|SQLException e) {
			e.printStackTrace();
			
		}
		return empList;
		
	}
	
	public void addEmployee(Employee employee) {
		
		String query="insert into employee(ename,salary,email,mobile,doj,dob) values(?,?,?,?,?,?)";
		try(Connection con=DBUtil.getConnection();
			PreparedStatement ps=con.prepareStatement(query)){
			
			//ps.setLong(1, employee.getEid());
			ps.setString(1, employee.getEname());
			ps.setDouble(2, employee.getSalary());
			ps.setString(3, employee.getEmail());
			ps.setString(4, employee.getMobile());
			ps.setDate(5, java.sql.Date.valueOf(employee.getDoj()));
			ps.setDate(6, java.sql.Date.valueOf(employee.getDob()));
			ps.executeUpdate();
			System.out.println("row inserted");
			
			
		}
		catch(ClassNotFoundException|SQLException e) {
			e.printStackTrace();
		}
		
		
		
	}
	
	public void updateEmployee(Employee emp) {
		
		
		
	}
	
	public Employee getEmployeeById(long eid) {
		String query="select * from employee where eid=?";
		Employee e=new Employee();
		try (Connection con=DBUtil.getConnection();
			PreparedStatement ps=con.prepareStatement(query);
			){
			ps.setLong(1, eid);
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				
				e.setEid(rs.getLong("eid"));
				e.setEname(rs.getString("ename"));
				e.setSalary(rs.getDouble("salary"));
				e.setEmail(rs.getString("email"));
				e.setMobile(rs.getString("mobile"));
				e.setDoj(rs.getDate("doj").toLocalDate());
				e.setDob(rs.getDate("dob").toLocalDate());
				
			}
			
			
		}catch(ClassNotFoundException|SQLException ex) {
			ex.printStackTrace();
		}
		System.out.println(e);
		return e;
		
	}

}
