package edu.ccsu.timelapse.main;

import edu.ccsu.timelapse.components.TemperatureSensor;
import edu.ccsu.timelapse.providers.SensorServiceProvider;
import edu.ccsu.timelapse.providers.ServiceProvider;
import static edu.ccsu.timelapse.core.Helper.*;

/**
 * Runs the application to take a picture 10 times before ending.
 *
 */
public class Main {

	public static void main(String[] args) {
		
		
		
		App app = new App(new ServiceProvider[]{
			new SensorServiceProvider(),
		});

		TemperatureSensor temperatureSensor = (TemperatureSensor) app("temperatureSensor");
		//app.bootstrap();
		
		//Led myLed = (Led) app("led");
		
		//Camera camera = (Camera) app("camera");
		
		//camera.toString();
		
	}

}