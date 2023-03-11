package org.example.example1;

public abstract class Vehicle {

	private String model;

	public Vehicle(String model) {
		this.model = model;
	}

	public String getModel() {
		return model;
	}
	
	@Override
	public String toString() {
		return String.format("model= %s, wheels= %d, hasAirBags=%b",model,getWheels(),hasAirBags());
	}

	protected abstract int getWheels();

	protected abstract boolean hasAirBags();
}
