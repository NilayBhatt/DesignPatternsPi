package edu.ccsu.timelapse.listeners;

import java.util.Objects;

import edu.ccsu.timelapse.listeners.contracts.TemperatureListener;
import edu.ccsu.timelapse.main.Container;
import edu.ccsu.timelapse.models.Image;

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
	@Override
	public void temperatureIncreased(double delta) {
		System.out.println("Hue editor reacting to a temperature increase.");
		
	}

	/**
	 * Act on an temperature decrease with a delta.
	 * 
	 * @param delta
	 */
	@Override
	public void temperatureDecreased(double delta) {
		System.out.println("Hue editor reacting to a temperature decrease.");
		
	}
	
}
