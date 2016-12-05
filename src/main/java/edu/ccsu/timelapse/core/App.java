/**
 * Container class contains a Camera instance and multiple images inside the container.
 * 
 */
package edu.ccsu.timelapse.core;


import static edu.ccsu.timelapse.core.Helper.app;
import static edu.ccsu.timelapse.core.Helper.event;

import java.util.Iterator;
import java.util.Properties;

import edu.ccsu.timelapse.builders.TimelapseBuilderInterface;
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
		
		ImageCollectionFactoryInterface factory = app("imageCollectionFactory");
		
		Properties props = app("config");
		
		ImageComposite collection = factory.make(Integer.parseInt(props.getProperty("NUM_PIC")), Integer.parseInt(props.getProperty("INTERVAL")));
		
		ImageComponent toDecorate = (ImageComponent) collection;
		
		toDecorate = new ImageTimeDecorator(new ImageHueDecorator(toDecorate));
		
		toDecorate.decorateComponent((ImageDecorator) toDecorate);
		
		TimelapseBuilderInterface builder = app("timelapseBuilder");
		
		Iterator<ImageComponent> iterator = collection.iterator();
		
		while(iterator.hasNext()) {
			builder.addFrame(iterator.next());
		}
		
		builder.setWidth(1080);
		builder.setHeight(1920);
		builder.setRepeat(true);
		builder.setTimeBetween(2);
		
		Timelapse timelapse = builder.getResult();
		
		timelapse.toGIF();
	}

}
