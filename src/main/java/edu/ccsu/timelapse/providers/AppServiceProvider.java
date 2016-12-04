package edu.ccsu.timelapse.providers;

import edu.ccsu.timelapse.components.ConsoleUnixLogger;
import edu.ccsu.timelapse.components.Logger;

/**
 * Binds general application services to the container.
 *
 */
public class AppServiceProvider extends ServiceProvider {

	@Override
	public void register() {
		
		//this.app().bind("gif", new GIFMaker());

		this.app().bind("logger", Logger.class, new ConsoleUnixLogger());
		
	}
	
}