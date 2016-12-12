package edu.ccsu.timelapse.events;

import edu.ccsu.timelapse.event.Event;
import edu.ccsu.timelapse.listeners.contracts.GenericListener;

/**
 * 
 * This event publishes to the listeners when the event is published
 *
 */
public class PictureTaken implements Event<GenericListener> {

	/**
	 * Publishes the event to the listeners.
	 */
	@Override
	public void publish(GenericListener listener) {
		
		listener.handle();
	}
	
	/**
	 * String representation of this object.
	 * 
	 * @return String
	 */
	@Override
	public String toString() {
		return "This is PictureTaken.";
	}
}
