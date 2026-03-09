package com.coforge.JdbcProcedureApp;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
       
    	
    	Class.forName("com.mysql.cj.jdbc.Driver");
        System.out.println("Driver loaded");
        
        String uname="root";
        String password="";
        String url="jdbc:mysql://localhost:3306/cfgdb";
        
        Connection con=DriverManager.getConnection(url,uname,password);
        System.out.println("Connection Established");
        
        String query="{call get_all_students()}";
        CallableStatement cs=con.prepareCall(query);
        
        ResultSet rs=cs.executeQuery();
        System.out.println("Student data");
        System.out.println("*****************");
        ResultSetMetaData rsmd=rs.getMetaData();
        int count=rsmd.getColumnCount();
        for(int i=1;i<=count;i++)
        	System.out.println(rsmd.getColumnName(i)+"   "+rsmd.getColumnTypeName(i));
        System.out.println("*****************"); 
        while(rs.next()) {
        	System.out.println("Stdid : "+rs.getInt(rsmd.getColumnName(1)));
        	System.out.println("Stdname : "+rs.getString(rsmd.getColumnName(2)));
        	System.out.println("Marks : "+rs.getDouble(rsmd.getColumnName(3)));
        	System.out.println("Mobile Number: "+rs.getString(rsmd.getColumnName(4)));
        	System.out.println("*************************");
        }
        
        
        
    }
}
