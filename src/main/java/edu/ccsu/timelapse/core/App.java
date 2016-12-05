/**
 * Container class contains a Camera instance and multiple images inside the container.
 * 
 */
package edu.ccsu.timelapse.core;


import edu.ccsu.timelapse.events.AppBootstrapped;
import edu.ccsu.timelapse.factories.ImageCollectionFactoryInterface;
import edu.ccsu.timelapse.imagecollections.ImageComponent;
import edu.ccsu.timelapse.imagecollections.ImageComposite;
import edu.ccsu.timelapse.modifiers.ImageHueDecorator;
import edu.ccsu.timelapse.modifiers.ImageTimeDecorator;
import edu.ccsu.timelapse.providers.ServiceProvider;
import edu.ccsu.timelapse.builders.GIF;
import edu.ccsu.timelapse.builders.TimelapseBuilderInterface;
import static edu.ccsu.timelapse.core.Helper.*;

import java.util.Iterator;


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
	public void start(int numPics, int interval) {
		System.out.println("The application has started.");
		
		ImageCollectionFactoryInterface factory = app("imageCollectionFactory");
		
		ImageComponent collection = factory.make(numPics, interval);
		
		collection = new ImageTimeDecorator(new ImageHueDecorator(collection));
		
		TimelapseBuilderInterface builder = app("timelapseBuilder");
		
		Iterator<ImageComponent> iterator = ((ImageComposite)collection).iterator();
		
		while(iterator.hasNext()) {
			builder.addFrame(iterator.next());
		}
		
		builder.getResult();
		
		GIF gif = app("gif");
		
		gif.withDelay(1000).from("./images/").to("timelapse.gif").make();
	}

}
