package edu.ccsu.timelapse.core;

import edu.ccsu.timelapse.event.Event;
import edu.ccsu.timelapse.event.EventDispatcher;

/**
 * Static helper for a nice API in referencing the EventDispatcher as well as IoC Container.
 *
 */
public final class Helper {
	

	/**
	 * Get a concrete instance of an interface.
	 * 
	 * @param key
	 * @return object instance
	 */
	public static <E> E app(Class<E> key) {
		
		return Container.getInstance().get(key);
	}	

	/**
	 * Get a concrete instance of an interface bind by a string key.
	 * 
	 * @param key
	 * @return object instance
	 */
	public static <E> E app(String key) {
		
		return Container.getInstance().get(key);
	}
	
	/**
	 * Bind a concrete class to an interface and string key.
	 * 
	 * @param normal
	 * @param key
	 * @param value
	 */
	public static void bind(String normal, Class<?> key, Object value) {
		Container.getInstance().bind(normal, key, value);
	}
	
	/**
	 * Bind a concrete class to an interface and string key.
	 * 
	 * @param key
	 * @param value
	 */
	public static void bind(Class<?> key, Object value) {
		Container.getInstance().bind(key, value);
	}
	
	/**
	 * Bind a concrete class to an interface and string key.
	 * 
	 * @param normal
	 * @param key
	 * @param closure
	 */
	public static void bind(String normal, Class<?> key, Bind<?> closure) {
		Container.getInstance().bind(normal, key, closure);
	}
	
	/**
	 * Bind a concrete class to an interface and string key.
	 * 
	 * @param key
	 * @param closure
	 */
	public void bind(Class<?> key, Bind<?> closure) {
		Container.getInstance().bind(key, closure);
	}
	
	/**
	 * Subscribe a listener to an event in the dispatcher.
	 * 
	 * @param event
	 * @param listener
	 */
	public static <E> void subscribe(Class<? extends Event<E>> event, E listener) {
		EventDispatcher.getInstance().subscribe(event, listener);
	}
	
	/**
	 * Fire an event using the dispatcher.
	 * 
	 * @param event
	 */
	public static <E> void event(Event<E> event) {
		EventDispatcher.getInstance().publish(event);
	}
	
	/**
	 * Fire an event using the dispatcher.
	 * 
	 * @param event
	 */
	public static <E> void fire(Event<E> event) {
		Helper.event(event);
	}
	
	/**
	 * String representation of this object.
	 * 
	 * @return String
	 */
	@Override
	public String toString() {
		return "This is the GIFMaker.";
	}
}
