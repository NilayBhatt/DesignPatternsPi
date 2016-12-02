package edu.ccsu.timelapse.main;

import edu.ccsu.timelapse.factories.ImageCollectionFactory;
import edu.ccsu.timelapse.imagecollections.ImageCollection;

public class ImageCollectionFactoryTest {
	
	/**
	 * Just to show how the factory object will be used.
	 * This single line of code would initialize an ImageCollection
	 * object, collect images for 3.5 hours at 1 image every 20 seconds,
	 * adds a decoration to the collection of images,
	 * and then return the finalized ImageCollection object.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		
		ImageCollection collection = ImageCollectionFactory.make(3.5, 20);
		
	}
}
