package edu.ccsu.timelapse.listeners;


import edu.ccsu.timelapse.listeners.contracts.GenericListener;

/**
 * Concrete listener for TemperatureListener.
 *
 */
public class SayHello implements GenericListener {

	/**
	 * Handle the event.
	 */
	public void handle() {
	
		System.out.println("Saying hello!");
	}
	
}
