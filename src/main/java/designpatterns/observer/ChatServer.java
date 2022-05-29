package designpatterns.observer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ChatServer {

	private Map<String, List<Subscriber>> subscribers = new HashMap<>();

	public void register(Subscriber subscriber, String subject) {
		if (this.subscribers.get(subject) == null)
			subscribers.put(subject, new ArrayList<>());
		this.subscribers.get(subject).add(subscriber);
	}

	public void unSubscribe(Subscriber subscriber, String subject) {
		if (subscribers.containsKey(subject)) {
			this.subscribers.get(subject).remove(subscriber);
		}
	}

	public void sendMessage(User user, String subject, String message) {
		if(this.subscribers.containsKey(subject)) {
			String userMessage = user.getName() + ": " + message;
			this.subscribers.get(subject).forEach(s -> s.handleMessage(userMessage));
		}
	}

}
