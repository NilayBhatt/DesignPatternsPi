package edu.ccsu.timelapse.main;

import static edu.ccsu.timelapse.core.Helper.app;

import edu.ccsu.timelapse.components.Camera;
import edu.ccsu.timelapse.providers.SensorServiceProvider;
import edu.ccsu.timelapse.providers.ServiceProvider;

/**
 * Runs the application to take a picture 10 times before ending.
 *
 */
public class Main {

	public static void main(String[] args) {
		
		
		
		App app = new App(new ServiceProvider[]{
			new SensorServiceProvider(),
		});
		
		app.bootstrap();
		
		Led myLed = (Led) app("led");
		
		Camera camera = (Camera) app("camera");
		
		camera.toString();
		
	}

}