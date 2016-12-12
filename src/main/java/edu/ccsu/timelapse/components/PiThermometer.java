package edu.ccsu.timelapse.components;

import edu.ccsu.timelapse.adapters.CommandLineAdapter;
import edu.ccsu.timelapse.components.contracts.Thermometer;

import java.io.IOException;

/**
 * TemperatureSensor class that adapts to the python code
 * The python code will be native and running on pi.
 */
public class PiThermometer extends CommandLineAdapter implements Thermometer {

	/**
	 * Overrides the command() method to build the command.
	 * @return String
	 */
	@Override
	public String command() {

		return "python ./scripts/temperature.py";
	}

	public int temperature() {

		int tempInFahrenheit = 0;
		try {
			tempInFahrenheit = (int) Double.parseDouble(this.readFirstLine(this.execute()));
		} catch (IOException e) {
			e.printStackTrace();
		}

		return  tempInFahrenheit;
	}
	
	/**
	 * String representation of this object.
	 * 
	 * @return String
	 */
	@Override
	public String toString() {
		return "This is the PiThermometer.";
	}
}
