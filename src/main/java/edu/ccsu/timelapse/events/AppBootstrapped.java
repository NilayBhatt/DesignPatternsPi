package edu.ccsu.timelapse.events;

import edu.ccsu.timelapse.event.Event;
import edu.ccsu.timelapse.listeners.contracts.GenericListener;

/**
 * An event used to represent the application successfully being bootstrapped.
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
	 * String representation of the app being bootstrapped.
	 */
	@Override
	public String toString() {
		return new String("An event signaling that the application has been bootstrapped.");
	}
	
}
