package com.coforge;

public class Customer  {
	
	private int custId;
	private String custName;
	private String city;
	private double orderCost;
	public Customer() {
		super();
	}
	public Customer(int custId, String custName, String city, double orderCost) {
		super();
		this.custId = custId;
		this.custName = custName;
		this.city = city;
		this.orderCost = orderCost;
	}
	
	
	
	public int getCustId() {
		return custId;
	}
	public void setCustId(int custId) {
		this.custId = custId;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public double getOrderCost() {
		return orderCost;
	}
	public void setOrderCost(double orderCost) {
		this.orderCost = orderCost;
	}
	@Override
	public String toString() {
		return "Customer [custId=" + custId + ", custName=" + custName + ", city=" + city + ", orderCost=" + orderCost
				+ "]";
	}
//	@Override
//	public int compareTo(Customer o) {
//		
//		return (int)(this.getOrderCost()-o.getOrderCost());
//	}
//	@Override
//	public int compareTo(Customer o) {
//		return this.getCustName().compareTo(o.getCustName());
//	}
	
//	@Override
//	public int compareTo(Customer o) {
//		
//		return this.city.compareTo(o.city);
//	}
//	
	

}
