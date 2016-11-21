package edu.ccsu.timelapse.events;

import edu.ccsu.timelapse.event.Event;
import edu.ccsu.timelapse.listeners.contracts.TemperatureListener;

/**
 * An event used to represent the change in temperature.
 *
 */
public class TemperatureChange implements Event<TemperatureListener> {
	
	/**
	 * The absolute change in temperature.
	 */
	private double delta;
	
	/**
	 * Create a new instance of a TemperatureChange.
	 * 
	 * @param delta
	 */
	public TemperatureChange(double delta) {
		this.delta = delta;
	}
	
	/**
	 * Publish this event to a listener.
	 * 
	 * @param listener
	 */
	@Override
	public void publish(TemperatureListener listener) {
		
		if (delta > 0) {
			listener.temperatureIncreased(delta);
			return;
		}
		
		listener.temperatureDecreased(delta);
	}

}
