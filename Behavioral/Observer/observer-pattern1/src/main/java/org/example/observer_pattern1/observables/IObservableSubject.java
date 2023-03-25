package org.example.observer_pattern1.observables;

import org.example.observer_pattern1.observers.IObserver;

public interface IObservableSubject {

	public void subscribe(IObserver observer);
	public void unsubscribe(IObserver observer);
	public void notifyAllObservers();
}
