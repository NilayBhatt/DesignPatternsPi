package edu.ccsu.timelapse.listeners.contracts;

/**
 * A contract for a temperature listener.
 *
 */
public interface TemperatureListener {
	
	/**
	 * Called when the temperature increased with a delta.
	 * 
	 * @param delta
	 */
	public void temperatureChanged(double delta);
	
}
