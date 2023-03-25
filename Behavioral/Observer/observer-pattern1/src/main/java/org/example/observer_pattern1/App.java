package org.example.observer_pattern1;

import org.example.observer_pattern1.observables.WeatherStation;
import org.example.observer_pattern1.observers.ConcreteObserverA;
import org.example.observer_pattern1.observers.ConcreteObserverB;

public class App {
	public static void main(String[] args) {
		WeatherStation weatherStation = new WeatherStation();
		
		ConcreteObserverA observerA = new ConcreteObserverA(weatherStation);
		weatherStation.subscribe(observerA);
		
		ConcreteObserverB observerB = new ConcreteObserverB(weatherStation);
		weatherStation.subscribe(observerB);
		
		weatherStation.notifyAllObservers();
		
		weatherStation.unsubscribe(observerA);
		
		weatherStation.notifyAllObservers();
	}
}
