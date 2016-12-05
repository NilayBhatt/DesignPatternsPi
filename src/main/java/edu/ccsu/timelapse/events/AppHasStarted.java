package edu.ccsu.timelapse.events;


import edu.ccsu.timelapse.listeners.contracts.GenericListener;
import edu.ccsu.timelapse.event.Event;

public class AppHasStarted implements Event<GenericListener> {

	@Override
	public void publish(GenericListener listener) {
		listener.handle();
	}

}
