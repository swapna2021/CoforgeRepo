package com.coforge;

public class BankApp {

	public static void main(String[] args) throws InsufficientFundsException {
	
		Account acc=new Account(12345767,"Swapna","ICICI",7000);
		acc.withDraw(10000);
		acc.deposit(10000);
		acc.withDraw(12000);

	}

}
