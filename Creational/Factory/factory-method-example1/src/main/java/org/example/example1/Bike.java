package org.example.example1;

public class Bike extends Vehicle {

	private static final int WHEELS = 2;

	public Bike(String model) {
		super(model);
	}

	@Override
	protected int getWheels() {
		return WHEELS;
	}

	@Override
	protected boolean hasAirBags() {
		return false;
	}

}
