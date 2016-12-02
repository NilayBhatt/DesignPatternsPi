package edu.ccsu.timelapse.main;

import edu.ccsu.timelapse.core.App;
import edu.ccsu.timelapse.providers.EventServiceProvider;
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
			new EventServiceProvider()
		});

		app.bootstrap();

	}

}