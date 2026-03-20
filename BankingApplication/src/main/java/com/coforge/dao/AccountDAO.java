package com.coforge.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.coforge.model.Account;

public class AccountDAO {

	public List<Account> geAllAccounts(Connection con) throws SQLException {
		
		String query="select * from account";
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery(query);
		List<Account> accList=new ArrayList<Account>();
		while(rs.next()) {
			Account acc=new Account();
			acc.setAccNo(rs.getInt("accno"));
			acc.setAccHolderName(rs.getString("accholdername"));
			acc.setAccType(rs.getString("acctype"));
			acc.setBalance(rs.getDouble("balance"));
			accList.add(acc);
		}
		
		return accList;
		
	}

}
