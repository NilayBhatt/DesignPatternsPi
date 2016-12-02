package edu.ccsu.timelapse.components;

import edu.ccsu.timelapse.adapters.CommandLineAdapter;

public class TemperatureSensor extends CommandLineAdapter {

	@Override
	public String command() {
		
		return "python ./temperature.py";
	}
	
}
