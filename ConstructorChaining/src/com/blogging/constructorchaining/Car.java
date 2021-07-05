package com.blogging.constructorchaining;

public class Car extends Vehicle{
	int regno;

	public Car(int regno) {
		super("Bike");//This specifies the constructor of the parent class.
		this.regno = regno;
	}

}
