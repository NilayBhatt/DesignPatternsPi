package edu.ccsu.timelapse.providers;

import edu.ccsu.timelapse.core.Container;
import edu.ccsu.timelapse.event.EventDispatcher;

public abstract class ServiceProvider {
	
	/**
	 * Register the service.
	 */
	public void register() { }
	
	/**
	 * Get an instance of the container.
	 * 
	 * @return application container
	 */
	protected Container app() {
		return Container.getInstance();
	}
	
	/**
	 * Get an instance of the EventDispatcher.
	 * 
	 * @return application dispatcher
	 */
	protected EventDispatcher dispatcher() {
		return EventDispatcher.getInstance();
	}
	
	/**
	 * Get a string representation of the service provider.
	 * 
	 * @return String
	 */
	@Override
	public String toString() {
		
		return this.getClass().getName();
	}
	
}
