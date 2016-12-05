package edu.ccsu.timelapse.listeners;


import edu.ccsu.timelapse.components.Logger;
import edu.ccsu.timelapse.listeners.contracts.GenericListener;
import static edu.ccsu.timelapse.core.Helper.*;

/**
 * Concrete listener for TemperatureListener.
 *
 */
public class NotifyItBootstrapped implements GenericListener {

	/**
	 * Instance of the logger.
	 */
	private Logger logger;
	
	/**
	 * Create a new instance of the listener.
	 */
	public NotifyItBootstrapped() {
		this.logger = app("logger");
	}
	
	/**
	 * Handle the event.
	 */
	public void handle() {
		this.logger.info("The applicatoin has successfully bootstrapped.");
	}
	
}
