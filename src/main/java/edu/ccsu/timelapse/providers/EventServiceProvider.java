package edu.ccsu.timelapse.providers;

import edu.ccsu.timelapse.events.AppBootstrapped;
import edu.ccsu.timelapse.events.AppHasStarted;
import edu.ccsu.timelapse.events.PictureTaken;
import edu.ccsu.timelapse.listeners.NotifyItBootstrapped;
import edu.ccsu.timelapse.listeners.NotifyItStarted;
import edu.ccsu.timelapse.listeners.NotifyPictureTaken;

/**
 * Provider for binding events to the dispatcher.
 *
 */
public class EventServiceProvider extends ServiceProvider {

	/**
	 * Register events.
	 */
	public void register() {
		
		this.dispatcher().subscribe(AppBootstrapped.class, new NotifyItBootstrapped());
		this.dispatcher().subscribe(AppHasStarted.class, new NotifyItStarted());
		this.dispatcher().subscribe(PictureTaken.class, new NotifyPictureTaken());
		
	}
	
	/**
	 * String representation of this object.
	 * 
	 * @return String
	 */
	@Override
	public String toString() {
		return "This is EventServiceProvider.";
	}
}
