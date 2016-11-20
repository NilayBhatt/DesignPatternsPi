package edu.ccsu.cs417.fall16.group4.listeners;

import edu.ccsu.cs417.fall16.group4.listeners.contracts.TemperatureListener;

public class HueEditorListener implements TemperatureListener {

	@Override
	public void temperatureIncreased(double delta) {
		System.out.println("Hue editor reacting to a temperature increase.");
		
	}

	@Override
	public void temperatureDecreased(double delta) {
		System.out.println("Hue editor reacting to a temperature decrease.");
		
	}

}
