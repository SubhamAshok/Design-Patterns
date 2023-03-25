package org.example.observer_pattern2.subscriber;

import org.example.observer_pattern2.publisher.NewsPublisher;

public class EmailSubscriber implements ISubscriber {

	NewsPublisher publisher;
	String news;

	public EmailSubscriber(NewsPublisher publisher) {
		this.publisher = publisher;
	}

	@Override
	public void update() {
		news=publisher.getNewsUpdates();
		System.out.println("Email notification: "+news);
	}

}
