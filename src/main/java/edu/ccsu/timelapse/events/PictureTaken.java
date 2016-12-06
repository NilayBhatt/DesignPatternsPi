package edu.ccsu.timelapse.events;

import edu.ccsu.timelapse.event.Event;
import edu.ccsu.timelapse.listeners.contracts.GenericListener;

public class PictureTaken implements Event<GenericListener> {

	/**
	 * Publish this event to a listener.
	 * 
	 * @param listener
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
