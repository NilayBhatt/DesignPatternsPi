package edu.ccsu.timelapse.listeners;

import edu.ccsu.timelapse.listeners.contracts.TemperatureListener;

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
