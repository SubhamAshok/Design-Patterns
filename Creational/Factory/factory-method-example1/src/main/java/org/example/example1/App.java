package org.example.example1;

public class App {
	public static void main(String[] args) {
		try {
			Vehicle v1 = VehicleFactory.getInstance("Bike", "HN50");
			System.out.println(v1);

			Vehicle v2 = VehicleFactory.getInstance("Car", "A1 2023");
			System.out.println(v2);

			Vehicle v3 = VehicleFactory.getInstance("Airplane", "BO21");
			System.out.println(v3.toString());
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
	}
}
