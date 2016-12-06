package edu.ccsu.timelapse.listeners;

import edu.ccsu.timelapse.components.Logger;
import edu.ccsu.timelapse.listeners.contracts.GenericListener;

import static edu.ccsu.timelapse.core.Helper.app;

/**
 * Method notifier for start of the app.
 */
public class NotifyItStarted implements GenericListener {

	/**
	 * Instance of the logger.
	 */
	private Logger logger;
	
	/**
	 * Create a new instance of the listener.
	 */
	public NotifyItStarted() {
		this.logger = app("logger");
	}
	
	/**
	 * Handle the event.
	 */
	public void handle() {
		this.logger.info("Application started.");
	}
	
}
