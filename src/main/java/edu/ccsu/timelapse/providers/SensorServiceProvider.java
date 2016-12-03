package edu.ccsu.timelapse.providers;

import edu.ccsu.timelapse.components.Camera;

/**
 * Register and bind sensors to the container.
 *
 */
public class SensorServiceProvider extends ServiceProvider {

	public void register() {
		
		// Bind the camera component to the service container.
		this.app().bind("camera", new Camera());
	}
	
}

interface CameraInterface {
	
}
