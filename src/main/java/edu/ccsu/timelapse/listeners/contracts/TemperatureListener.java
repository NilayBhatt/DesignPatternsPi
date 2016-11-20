package edu.ccsu.timelapse.listeners.contracts;

public interface TemperatureListener {
	public void temperatureIncreased(double delta);
	
	public void temperatureDecreased(double delta);
}
