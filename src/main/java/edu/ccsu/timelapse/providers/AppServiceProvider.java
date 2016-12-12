package edu.ccsu.timelapse.providers;

import edu.ccsu.timelapse.builders.GIF;
import edu.ccsu.timelapse.builders.GIFMaker;
import edu.ccsu.timelapse.builders.TimelapseBuilder;
import edu.ccsu.timelapse.builders.TimelapseBuilderInterface;
import edu.ccsu.timelapse.components.ConsoleUnixLogger;
import edu.ccsu.timelapse.components.Logger;

/**
 * Binds general application services to the container.
 *
 */
public class AppServiceProvider extends ServiceProvider {

	/**
	 * Register all the services for this application.
	 */
	@Override
	public void register() {
		
		this.app().bind("gif", GIF.class, new GIFMaker());

		this.app().bind("logger", Logger.class, new ConsoleUnixLogger());
		
		this.app().bind("timelapseBuilder", TimelapseBuilderInterface.class, new TimelapseBuilder());
		
	}
	
	/**
	 * String representation of this object.
	 * 
	 * @return String
	 */
	@Override
	public String toString() {
		return "This is AppServiceProvider.";
	}
	
}