package org.example.observer_pattern1.observers;

import org.example.observer_pattern1.observables.WeatherStation;

public class ConcreteObserverB implements IObserver {

	private WeatherStation weatherStation;
	private float temperature;

	public ConcreteObserverB(WeatherStation weatherStation) {
		this.weatherStation = weatherStation;
	}

	@Override
	public void update() {
		temperature = weatherStation.getTemperature();
		System.out.println("Observer B's temperature updated to: " + temperature);
	}

}
