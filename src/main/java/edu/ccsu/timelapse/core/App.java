/**
 * Container class contains a Camera instance and multiple images inside the container.
 * 
 */
package edu.ccsu.timelapse.core;


import edu.ccsu.timelapse.builders.TimelapseBuilderInterface;
import edu.ccsu.timelapse.components.Logger;
import edu.ccsu.timelapse.events.AppBootstrapped;
import edu.ccsu.timelapse.events.AppHasStarted;
import edu.ccsu.timelapse.factories.ImageCollectionFactoryInterface;
import edu.ccsu.timelapse.imagecollections.ImageComponent;
import edu.ccsu.timelapse.imagecollections.ImageComposite;
import edu.ccsu.timelapse.models.Timelapse;
import edu.ccsu.timelapse.modifiers.ImageDecorator;
import edu.ccsu.timelapse.modifiers.ImageHueDecorator;
import edu.ccsu.timelapse.modifiers.ImageTimeDecorator;
import edu.ccsu.timelapse.providers.ServiceProvider;

import java.util.Iterator;
import java.util.Properties;

import static edu.ccsu.timelapse.core.Helper.app;
import static edu.ccsu.timelapse.core.Helper.event;


/**
 * Application entry point for timelapse.
 *
 */
public class App {
	
	/**
	 * List of service providers registered for the application.
	 */
	private ServiceProvider[] providers;
	
	/**
	 * Creates a new instance of the application.
	 * 
	 * @param providers
	 */
	public App(ServiceProvider[] providers) {
		this.providers = providers;
	}
	
	/**
	 * Bootstrap the application registering all service providers.
	 */
	public void bootstrap() {
		
		for (ServiceProvider provider : this.providers) {
			provider.register();
		}
		
		event(new AppBootstrapped());
		
	}

	
	/**
	 * Start the application.
	 */
	public void start() {
		
		event(new AppHasStarted());
		Properties props = app("config");
		Logger logger = app("logger");
		
		ImageCollectionFactoryInterface factory = app("imageCollectionFactory");
		

		
		ImageComposite collection = factory.make(Integer.parseInt(props.getProperty("NUM_PIC")), Integer.parseInt(props.getProperty("INTERVAL")));
		
		ImageComponent toDecorate = (ImageComponent) collection;
		
		logger.info("Decorating the images.");
		
		toDecorate = new ImageTimeDecorator(new ImageHueDecorator(toDecorate));

		collection.decorateComponent((ImageDecorator) toDecorate);
		
		TimelapseBuilderInterface builder = app("timelapseBuilder");
		
		Iterator<ImageComponent> iterator = collection.iterator();
		
		while(iterator.hasNext()) {
			builder.addFrame(iterator.next());
		}
		
		builder.setWidth(1920);
		builder.setHeight(1080);
		builder.setRepeat(true);
		builder.setTimeBetween(1000);
		
		Timelapse timelapse = builder.getResult();
		
		logger.info("Creating the timelapse GIF now!");
		timelapse.toGIF();
		
		logger.success("ALL DONE, ENJOY!");
	}

}
