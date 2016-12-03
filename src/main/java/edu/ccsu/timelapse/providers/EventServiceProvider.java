package edu.ccsu.timelapse.providers;

import edu.ccsu.timelapse.events.AppBootstrapped;
import edu.ccsu.timelapse.listeners.SayHello;

/**
 * Provider for binding events to the dispatcher.
 *
 */
public class EventServiceProvider extends ServiceProvider {

	public void register() {
		
		// When the application is bootstrapped, say hello.
		this.dispatcher().subscribe(AppBootstrapped.class, new SayHello());
	}
	
}
