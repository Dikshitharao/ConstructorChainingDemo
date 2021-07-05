package com.blogging.constructorchaining;

public abstract class Vehicle {
	
	String type;
	
	public Vehicle() {
		System.out.println("Hey I am a default constructor of abstract class vehicle");
	
	}

	public Vehicle(String type) {
		
		this.type = type;
		System.out.println("The type of this vehicle is "+type);
	}
	
	
	

}
