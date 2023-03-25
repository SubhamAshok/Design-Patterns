package org.example.observer_pattern2.publisher;

import java.util.ArrayList;
import java.util.List;

import org.example.observer_pattern2.subscriber.ISubscriber;

public class NewsPublisher implements IPublisher {

	List<String> articles = new ArrayList<String>();

	@Override
	public void subscribe(ISubscriber subscriber) {
		subscribers.add(subscriber);
	}

	@Override
	public void unSubscribe(ISubscriber subscriber) {
		subscribers.remove(subscriber);
	}

	@Override
	public void notifySubscribers() {
		subscribers.forEach(ISubscriber::update);
	}

	public String getNewsUpdates() {
		return "New article is now available: " + articles.get(articles.size() - 1).substring(0, 20) + "...";
	}

	public void addNewsUpdates(String news) {
		articles.add(news);
		notifySubscribers();
	}
}
