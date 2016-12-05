package edu.ccsu.timelapse.providers;

import edu.ccsu.timelapse.components.PiCamera;
import edu.ccsu.timelapse.components.PiThermometer;
import edu.ccsu.timelapse.components.contracts.Camera;
import edu.ccsu.timelapse.components.contracts.Thermometer;

import static edu.ccsu.timelapse.core.Helper.*;

/**
 * Register and bind sensors to the container.
 *
 */
public class SensorServiceProvider extends ServiceProvider {

	public void register() {
		
		bind("camera", Camera.class, new PiCamera());
		bind("thermometer", Thermometer.class, new PiThermometer());
		
	}
	
}
