/**
 * Container class contains a Camera instance and multiple images inside the container.
 * 
 */
package edu.ccsu.timelapse.core;

import static edu.ccsu.timelapse.core.Helper.event;

import edu.ccsu.timelapse.events.AppBootstrapped;
import edu.ccsu.timelapse.providers.ServiceProvider;

public class App {
	
	/**
	 * List of service providers registered for the application.
	 */
	private ServiceProvider[] providers;
	
	/**
	 * Creates a new instance of the application.
	 * 
	 * @param providers
	 */
	public App(ServiceProvider[] providers) {
		this.providers = providers;
	}
	
	/**
	 * Bootstrap the application registering all service providers.
	 */
	public void bootstrap() {
		
		for (ServiceProvider provider : this.providers) {
			provider.register();
		}
		
		event(new AppBootstrapped());
		
	}

}
