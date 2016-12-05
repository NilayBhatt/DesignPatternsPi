package edu.ccsu.timelapse.listeners;

import static edu.ccsu.timelapse.core.Helper.app;

import edu.ccsu.timelapse.components.Logger;
import edu.ccsu.timelapse.listeners.contracts.GenericListener;

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
