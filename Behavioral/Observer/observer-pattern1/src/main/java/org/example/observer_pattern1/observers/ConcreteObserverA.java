package org.example.observer_pattern1.observers;

import org.example.observer_pattern1.observables.WeatherStation;

public class ConcreteObserverA implements IObserver {

	private WeatherStation weatherStation;
	private float temperature;

	public ConcreteObserverA(WeatherStation weatherStation) {
		this.weatherStation = weatherStation;
	}

	@Override
	public void update() {
		temperature = weatherStation.getTemperature();
		System.out.println("Observer A's temperature updated to: " + temperature);
	}

}
