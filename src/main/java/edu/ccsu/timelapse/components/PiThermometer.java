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
	protected String command() {
		
		return "python ./scripts/temperature.py";
	}

	/**
	 * Gets the temperature from the
	 * temperature sensor of the GrovePi
	 * @return double temperature in fahrenheit.
	 */
	public int temperature() {

		int tempInFahrenheit = 0;
		try {
			tempInFahrenheit = (int) Double.parseDouble(this.readFirstLine(this.execute()));
		} catch (IOException e) {
			e.printStackTrace();
		}

		return  tempInFahrenheit;
	}
}
