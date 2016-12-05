package edu.ccsu.timelapse.events;

import edu.ccsu.timelapse.event.Event;
import edu.ccsu.timelapse.listeners.contracts.GenericListener;

public class PictureTaken implements Event<GenericListener> {

	@Override
	public void publish(GenericListener listener) {
		
		listener.handle();
	}

}
