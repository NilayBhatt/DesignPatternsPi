package edu.ccsu.timelapse.core;

import edu.ccsu.timelapse.event.Event;
import edu.ccsu.timelapse.event.EventDispatcher;

/**
 * Static helper for a nice API in referencing Singletons.
 *
 */
public final class Helper {
	
	/**
	 * Resolve an object out of the container.
	 * 
	 * @param key
	 * @return Object
	 */
	public static Object app(String key) {
		
		return Container.getInstance().get(key);
	}
	
	/**
	 * Bind a key and object into the app container.
	 * 
	 * @param key
	 * @param value
	 */
	public static void bind(String key, Object value) {
		Container.getInstance().bind(key, value);
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
	
}
