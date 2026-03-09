package com.coforge;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;


public class App {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        System.out.println("Hello World!");
        
        Class.forName("com.mysql.cj.jdbc.Driver");
        System.out.println("Driver loaded");
        
        String uname="root";
        String password="";
        String url="jdbc:mysql://localhost:3306/cfgdb";
        
        Connection con=DriverManager.getConnection(url,uname,password);
        System.out.println("Connection Established");
        //insert code
//        String query="insert into student values (?,?,?,?)";
//        PreparedStatement ps=con.prepareStatement(query);
//        ps.setInt(1, 788);
//        ps.setString(2, "Krithi");
//        ps.setDouble(3, 99);
//        ps.setString(4, "7897897891");
//        ps.executeUpdate();
//        System.out.println("row inserted");
        
        //update code
//        String query="update student set marks=? where stdid=?";
//        PreparedStatement ps=con.prepareStatement(query);
//        ps.setDouble(1, 85);
//        ps.setInt(2, 788);
//        ps.executeUpdate();
//        System.out.println("row updated");
//        
        
        
        //delete code
        
        String query="delete from student where stdid=?";
        PreparedStatement ps=con.prepareStatement(query);
        ps.setInt(1,788);
        ps.executeUpdate();
        System.out.println("row deleted");
        
        
       
        Statement st=con.createStatement();
        String query1="select * from student";
        ResultSet rs =  st.executeQuery(query1);
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
