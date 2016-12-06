package edu.ccsu.timelapse.listeners;


import edu.ccsu.timelapse.components.Logger;
import edu.ccsu.timelapse.listeners.contracts.GenericListener;
import static edu.ccsu.timelapse.core.Helper.*;

import java.util.Objects;

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
		this.logger.info("The application has successfully bootstrapped.");
	}
	
	/**
	 * String representation of this object.
	 * 
	 * @return string
	 */
	@Override
	public String toString() {
		return "This is NotifyItBootstrapped.";
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
	 * Checks if two objects are equal
	 * 
	 * @return true if equal
	 */
	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof NotifyItBootstrapped) && (this.hashCode() != ((NotifyItBootstrapped)obj).hashCode())) {
			return false;
		}
		
		return true;
	}
	
}
