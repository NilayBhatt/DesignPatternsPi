package edu.ccsu.timelapse.main;

import edu.ccsu.timelapse.core.App;
import edu.ccsu.timelapse.providers.AppServiceProvider;
import edu.ccsu.timelapse.providers.ConfigServiceProvider;
import edu.ccsu.timelapse.providers.EventServiceProvider;
import edu.ccsu.timelapse.providers.FactoryServiceProvider;
import edu.ccsu.timelapse.providers.SensorServiceProvider;
import edu.ccsu.timelapse.providers.ServiceProvider;

/**
 * Runs the application.
 *
 */
public class Main {

	public static void main(String[] args) {
		
		App app = new App(new ServiceProvider[]{
			new ConfigServiceProvider(),
			new AppServiceProvider(),
			new SensorServiceProvider(),
			new EventServiceProvider(),
			new FactoryServiceProvider()
		});

		app.bootstrap();
		
		app.start();

	}

}