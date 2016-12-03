/**
 * Container class contains a Camera instance and multiple images inside the container.
 * 
 */
package edu.ccsu.timelapse.core;

import edu.ccsu.timelapse.factories.ImageCollectionFactory;
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
		
		//event(new AppBootstrapped());
		
	}
	
	/**
	 * Start the application.
	 */
	public void start() {
		System.out.println("The application has started.");
		ImageCollectionFactory.make(20, 1);
	}

}
