package org.example.observer_pattern2.subscriber;

import org.example.observer_pattern2.publisher.NewsPublisher;

public class PhoneSubscriber implements ISubscriber {

	NewsPublisher publisher;
	String news;
	
	public PhoneSubscriber(NewsPublisher publisher) {
		this.publisher = publisher;
	}

	@Override
	public void update() {
		news=publisher.getNewsUpdates();
		System.out.println("Phone Notification: "+news);
	}

}
