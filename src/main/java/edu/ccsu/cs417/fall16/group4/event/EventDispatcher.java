package edu.ccsu.cs417.fall16.group4.event;

import java.util.ArrayList;
import java.util.HashMap;

public final class EventDispatcher {

	private final HashMap<Class, ArrayList> events = new HashMap<Class, ArrayList>();
	
	public <E> void subscribe(Class<? extends Event<E>> event, E listener) {
		ArrayList<E> subscribers = this.getListeners(event);
		
		if (! subscribers.contains(listener)) {
			subscribers.add(listener);
		}
	}
	
	public <E> void publish(Event<E> event) {
		Class<Event<E>> eventClass = (Class<Event<E>>) event.getClass();
		ArrayList<E> subscribers = this.getListeners(eventClass);
		
		for (E listener : subscribers) {
			event.publish(listener);
		}
	}
	
	private <E> ArrayList<E> getListeners(Class<? extends Event<E>> event) {
		ArrayList<E> subscribers = events.get(event);
		
		if (subscribers == null) {
			subscribers = new ArrayList<E>();
			events.put(event, subscribers);
		}
		
		return subscribers;
	}
	
	public <E> void fire(Event<E> event) {
		this.publish(event);
	}
	
	public <E> void dispatch(Event<E> event) {
		this.publish(event);
	}
	
	
}
