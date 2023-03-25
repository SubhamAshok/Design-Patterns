package org.example.observer_pattern2;

import org.example.observer_pattern2.publisher.NewsPublisher;
import org.example.observer_pattern2.subscriber.EmailSubscriber;
import org.example.observer_pattern2.subscriber.PhoneSubscriber;

public class App {
	public static void main(String[] args) {
		NewsPublisher newsPublisher = new NewsPublisher();

		EmailSubscriber emailSubsriber = new EmailSubscriber(newsPublisher);
		PhoneSubscriber phoneSubscriber = new PhoneSubscriber(newsPublisher);

		newsPublisher.subscribe(phoneSubscriber);
		newsPublisher.subscribe(emailSubsriber);

		newsPublisher.addNewsUpdates("World records highest temperature in last decade!");

		newsPublisher.unSubscribe(phoneSubscriber);
		newsPublisher.addNewsUpdates("IND wins the series by 3-0");
	}
}
