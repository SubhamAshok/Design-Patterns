package org.example.observer_pattern2.publisher;

import java.util.ArrayList;
import java.util.List;

import org.example.observer_pattern2.subscriber.ISubscriber;

public interface IPublisher {


	List<ISubscriber> subscribers = new ArrayList<ISubscriber>();
	
	void subscribe(ISubscriber subscriber);

	void unSubscribe(ISubscriber subscriber);

	void notifySubscribers();

}
