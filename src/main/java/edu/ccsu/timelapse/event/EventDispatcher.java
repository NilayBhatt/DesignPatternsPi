package edu.ccsu.timelapse.event;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;

/**
 * An event dispatcher. 
 * Keeps track of listeners subscribed to an event.
 * Notifies listeners when an event is fired
 *
 */
public final class EventDispatcher {
	
	/**
	 * Singleton instance of the dispatcher.
	 */
	private static EventDispatcher instance = null;
	
	/**
	 * Contains key, value pair of events and listeners that subscribe to those events.
	 */
	@SuppressWarnings("rawtypes")
	private final HashMap<Class, ArrayList> events = new HashMap<Class, ArrayList>();
	
	/**
	 * Create a new instance of an event dispatcher.
	 */
	private EventDispatcher() { }
	
	/**
	 * If an instance exists return it, if not create then return.
	 * 
	 * @return instance of a dispatcher
	 */
	public static EventDispatcher getInstance() {
		
		if (EventDispatcher.instance == null) {
			EventDispatcher.instance = new EventDispatcher();
		}
		
		return EventDispatcher.instance;

	}
	
	/**
	 * Subscribe a listener to an event.
	 * 
	 * @param event
	 * @param listener
	 */
	public <E> void subscribe(Class<? extends Event<E>> event, E listener) {
		ArrayList<E> subscribers = this.getListeners(event);
		
		if (! subscribers.contains(listener)) {
			subscribers.add(listener);
		}
	}
	
	/**
	 * Notify all subscribed listeners when an event is fired.
	 * 
	 * @param event
	 */
	@SuppressWarnings("unchecked")
	public <E> void publish(Event<E> event) {
		Class<Event<E>> eventClass = (Class<Event<E>>) event.getClass();
		ArrayList<E> subscribers = this.getListeners(eventClass);
		
		for (E listener : subscribers) {
			event.publish(listener);
		}
	}
	
	/**
	 * Get all listeners subscribed to an event.
	 * 
	 * @param event
	 * @return a ArrayList of all subscribed listeners
	 */
	@SuppressWarnings("unchecked")
	public <E> ArrayList<E> getListeners(Class<? extends Event<E>> event) {
		ArrayList<E> subscribers = events.get(event);
		
		if (subscribers == null) {
			subscribers = new ArrayList<E>();
			events.put(event, subscribers);
		}
		
		return subscribers;
	}
	
	/**
	 * Named publish method.
	 * 
	 * @param event
	 */
	public <E> void fire(Event<E> event) {
		this.publish(event);
	}
	
	/**
	 * Named publish method.
	 * 
	 * @param event
	 */
	public <E> void dispatch(Event<E> event) {
		this.publish(event);
	}
	
	/**
	 * Get the hashmap of events and listeners.
	 * 
	 * @return the hashmap
	 */
	@SuppressWarnings("rawtypes")
	public HashMap<Class, ArrayList> getEvents() {
		
		return this.events;
	}
	
	/**
	 * Returns a string representation of the class.
	 */
	@Override
	public String toString() {
		
		return Integer.toString(this.hashCode());
	}
	
	/**
	 * Returns a hash code of the instance of the class.
	 */
	@Override
	public int hashCode() {
		
		return Objects.hash(this.events);
	}
	
	/**
	 * Returns true if the EventDispatchers are equal.
	 * 
	 * @param another event dispatcher
	 */
	@Override
	public boolean equals(Object dispatcher) {
		
		if(!(dispatcher instanceof EventDispatcher)) {
			
			return false;
		}
		
		EventDispatcher otherDispatcher = (EventDispatcher) dispatcher;
		
		if(! this.getEvents().keySet().equals(otherDispatcher.getEvents().keySet())) {
			
			return false;
		}
		
		return true;
	}
	
	
}
