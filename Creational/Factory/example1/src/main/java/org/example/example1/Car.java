package org.example.example1;

public class Car extends Vehicle {

	private static final int WHEELS = 4;

	public Car(String model) {
		super(model);
	}

	@Override
	protected int getWheels() {
		return WHEELS;
	}

	@Override
	protected boolean hasAirBags() {
		return true;
	}

}
