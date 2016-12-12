package edu.ccsu.timelapse.listeners;

import edu.ccsu.timelapse.components.Logger;
import edu.ccsu.timelapse.listeners.contracts.GenericListener;

import static edu.ccsu.timelapse.core.Helper.app;

import java.util.Objects;

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
	
	/**
	 * String representation of this object.
	 * 
	 * @return String
	 */
	@Override
	public String toString() {
		return "This is NotifyItStarted.";
	}
	
	/**
	 * Hash code of this object.
	 * 
	 * @return int hashCode
	 */
	@Override
	public int hashCode() {
		return Objects.hashCode(this);
	}
	
	/**
	 * Checks if the two objects are equal
	 * 
	 * @return true if equal
	 */
	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof NotifyItStarted) && (this.hashCode() != ((NotifyItStarted)obj).hashCode())) {
			return false;
		}
		
		return true;
	}
}
