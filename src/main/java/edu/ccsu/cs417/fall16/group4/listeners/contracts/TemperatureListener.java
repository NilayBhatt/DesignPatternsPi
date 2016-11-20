package edu.ccsu.cs417.fall16.group4.listeners.contracts;

public interface TemperatureListener {
	public void temperatureIncreased(double delta);
	
	public void temperatureDecreased(double delta);
}
