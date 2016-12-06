package edu.ccsu.timelapse.events;

import edu.ccsu.timelapse.event.Event;
import edu.ccsu.timelapse.listeners.contracts.GenericListener;

/**
 * 
 * This event pubishes to the listeners when the event is published
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

}
