package edu.ccsu.timelapse.providers;

import edu.ccsu.timelapse.components.Camera;
import edu.ccsu.timelapse.main.Led;
import static edu.ccsu.timelapse.core.Helper.*;

public class SensorServiceProvider extends ServiceProvider {

	public void register() {
		
		bind("led", new Led());
		
		bind("camera", new Camera());
		
	}
	
}
