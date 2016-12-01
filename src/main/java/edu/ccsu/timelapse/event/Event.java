package edu.ccsu.timelapse.event;

/**
 * Interface for a generic event.
 *
 * @param <E>
 */
public interface Event<E> {
	
	/**
	 * Publish an event to the listener provided.
	 * 
	 * @param listener
	 */
	public void publish(E listener);
}