package edu.ccsu.timelapse.core;

import edu.ccsu.timelapse.event.Event;
import edu.ccsu.timelapse.event.EventDispatcher;

/**
 * Static helper for a nice API in referencing Singletons.
 *
 */
@SuppressWarnings("unchecked")
public final class Helper {
	

	public static <E> E app(Class<E> key) {
		
		return (E) Container.getInstance().get(key);
	}	
	
	public static <E> E app(String key) {
		
		return (E) Container.getInstance().get(key);
	}
	
	public static void bind(String normal, Class<?> key, Object value) {
		Container.getInstance().bind(normal, key, value);
	}
	
	public static void bind(Class<?> key, Object value) {
		Container.getInstance().bind(key, value);
	}
	
	public static void bind(String normal, Class<?> key, Bind<?> closure) {
		Container.getInstance().bind(normal, key, closure);
	}
	
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
	
}
