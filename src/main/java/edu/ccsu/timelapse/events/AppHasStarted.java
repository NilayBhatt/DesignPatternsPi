package edu.ccsu.timelapse.events;


import edu.ccsu.timelapse.listeners.contracts.GenericListener;
import edu.ccsu.timelapse.event.Event;

/**
 * 
 * Publishes the event of the App start
 *
 */
public class AppHasStarted implements Event<GenericListener> {

	/**
	 * Publishes the method for the listeners to listen in
	 */
	@Override
	public void publish(GenericListener listener) {
		listener.handle();
	}

}
