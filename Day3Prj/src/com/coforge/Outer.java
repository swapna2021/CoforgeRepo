package com.coforge;

public  class Outer {
	
	static String name;
	
	public static void printDetails() {
		name="Swapna";
		System.out.println("Name: "+name);
	}
	
	
	static class Inner{
		
		private String innerName;
		
		public void printDetailsOfInnerName() {
			this.innerName="mithila";
			System.out.println(innerName);
		}
		
	}
	
	
	public static void main(String[] args) {
		
//		Outer out=new Outer();
//		out.printDetails();
//		
//		Outer.Inner in=new Outer().new Inner();
//		in.printDetailsOfInnerName();
		
		
		Outer.name="swapna motupally";
		Outer.printDetails();
		Inner inner=new Inner();//if inner class is static we dont need outer object to instantiate inner object
		inner.printDetailsOfInnerName();
	}

}
