package com.coforge;

public class PetrolCar extends Car  {

	@Override
	public void engineType() {
		System.out.println("Engine type is Petrol type");
		
	}
	
	@Override
	public void audioSystem() {
		System.out.println("Audio system is with 6 speaker , woofers added");
	}

	public PetrolCar(String model) {
		super(model);
	}
	
	
	
	

}
