package com.coforge;

public interface AddOns {
	
	public default void audioSystem() {
		System.out.println("Audio system , by default 2 speaker");
	}
	
	public default void roofOpen() {
		System.out.println("By default roof open disabled");
	}
	
	public static void warrantyPolicy() {
		System.out.println("Warranty period : 3 years");
	}

}
