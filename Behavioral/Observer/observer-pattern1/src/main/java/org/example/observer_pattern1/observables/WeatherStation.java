package org.example.observer_pattern1.observables;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.example.observer_pattern1.observers.IObserver;

public class WeatherStation implements IObservableSubject {

	private static List<IObserver> observers = null;
	private float temperature;

	public WeatherStation() {
		observers = new ArrayList<IObserver>();
	}

	public void subscribe(IObserver observer) {
		observers.add(observer);
	}

	public void unsubscribe(IObserver observer) {
		observers.remove(observer);
	}

	public void notifyAllObservers() {
		observers.stream().forEach(IObserver::update);
	}

	public float getTemperature() {
		if (temperature == 0.0) {
			Random random = new Random();
			temperature = random.nextFloat(50);
		}
		return temperature;
	}
}
