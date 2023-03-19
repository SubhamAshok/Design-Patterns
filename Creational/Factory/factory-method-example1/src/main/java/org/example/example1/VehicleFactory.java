package org.example.example1;

public class VehicleFactory {

	public static Vehicle getInstance(String type, String model) {
		switch (type.toLowerCase()) {
		case "bike":
			return new Bike(model);
		case "car":
			return new Car(model);
		default:
			throw new IllegalArgumentException("This vehicle does not exist...");
		}
	}
}
