package edu.ccsu.timelapse.providers;

import edu.ccsu.timelapse.components.Camera;

public class SensorServiceProvider extends ServiceProvider {

	public void register() {
		
		// Bind the camera component to the service container.
		this.app().bind("camera", new Camera());
		
	}
	
}
