package edu.ccsu.timelapse.listeners;


import edu.ccsu.timelapse.listeners.contracts.TemperatureListener;

/**
 * Concrete listener for TemperatureListener.
 *
 */
public class HueEditorListener implements TemperatureListener {

	/**
	 * Act on an temperature increase with a delta.
	 * 
	 * @param delta
	 */
	public void temperatureIncreased(double delta) {
		System.out.println("Hue editor reacting to a temperature increase.");
		
	}

	/**
	 * Act on an temperature decrease with a delta.
	 * 
	 * @param delta
	 */
	public void temperatureDecreased(double delta) {
		System.out.println("Hue editor reacting to a temperature decrease.");
		
	}
	
	/**
	 * String representation of the listener.
	 */
	@Override
	public String toString() {
		
		return new String("HueEditorListener");
	}
	
}
