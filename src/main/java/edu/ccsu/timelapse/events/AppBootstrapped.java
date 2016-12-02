package edu.ccsu.timelapse.events;

import edu.ccsu.timelapse.event.Event;
import edu.ccsu.timelapse.listeners.contracts.GenericListener;

/**
 * An event used to represent the change in temperature.
 *
 */
public class AppBootstrapped implements Event<GenericListener> {
	

	/**
	 * Publish this event to a listener.
	 * 
	 * @param listener
	 */
	public void publish(GenericListener listener) {
		
		listener.handle();
	}
	
	/**
	 * String representation of a temperature change.
	 */
	@Override
	public String toString() {
		return new String("An event signaling that the application has been bootstrapped.");
	}
	
}
