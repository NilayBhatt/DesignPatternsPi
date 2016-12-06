package edu.ccsu.timelapse.listeners;

import edu.ccsu.timelapse.components.Logger;
import edu.ccsu.timelapse.listeners.contracts.GenericListener;

import static edu.ccsu.timelapse.core.Helper.app;

/**
 * This class notifies the user on stdout about the piture being taken
 */
public class NotifyPictureTaken implements GenericListener {

	/**
	 * Instance of the logger.
	 */
	private Logger logger;
	
	
	/**
	 * Create a new instance of the listener.
	 */
	public NotifyPictureTaken() {
		this.logger = app("logger");
	}
	
	/**
	 * Handle the event.
	 */
	public void handle() {
		this.logger.success("A picture was taken. SAY CHEESE!");
		
	}
	
}
