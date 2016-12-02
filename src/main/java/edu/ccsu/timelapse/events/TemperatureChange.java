package edu.ccsu.timelapse.events;

import java.util.Objects;

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
	public void publish(TemperatureListener listener) {
		
		listener.temperatureChanged(this.delta);
	}
	
	/**
	 * String representation of a temperature change.
	 */
	@Override
	public String toString() {
		return new String("The temperature changed by " + this.delta + " degrees.");
	}
	
	/**
	 * Get a unique hashcode for the instance.
	 */
	@Override
	public int hashCode() {
		return Objects.hash(this.delta);
	}
	
	/**
	 * Determine if the object is equal.
	 */
	@Override
	public boolean equals(Object obj) {
		if (! (obj instanceof TemperatureChange)) {
			
			return false;
		}
		
		TemperatureChange a = (TemperatureChange) obj;
		
		if(! this.toString().equals(obj.toString())) {
			
			return false;
		}
		
		return true;
	}

}
