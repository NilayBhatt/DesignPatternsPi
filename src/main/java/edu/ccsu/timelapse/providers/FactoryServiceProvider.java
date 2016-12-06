package edu.ccsu.timelapse.providers;

import edu.ccsu.timelapse.factories.ImageCollectionFactory;
import edu.ccsu.timelapse.factories.ImageCollectionFactoryInterface;
import edu.ccsu.timelapse.factories.ImageFactory;
import edu.ccsu.timelapse.factories.ImageFactoryInterface;

/**
 * Factory Provider, provides service for creating Factory.
 */
public class FactoryServiceProvider extends ServiceProvider {

	@Override
	public void register() {
		
		this.app().bind("imageFactory", ImageFactoryInterface.class, new ImageFactory());

		this.app().bind("imageCollectionFactory", ImageCollectionFactoryInterface.class, new ImageCollectionFactory());
		
	}
	
}
