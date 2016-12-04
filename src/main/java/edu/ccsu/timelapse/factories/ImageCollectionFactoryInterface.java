package edu.ccsu.timelapse.factories;

import edu.ccsu.timelapse.imagecollections.ImageComponent;

/**
 * An interface factory used to create a composite (or collection)
 * of Image objects.
 */
public interface ImageCollectionFactoryInterface {
	
	/**
	 * Creates an ImageComposite with numPics number of entries.
	 * Camera instance snaps the pictures, captures all of the 
	 * needed properties (temperature, timestamp from path) and
	 * uses ImageFactory to create an Image object. All Image
	 * objects are then added to the composite (collection).
	 * 
	 * @param int numPics
	 * @param int interval
	 * @return ImageComponent -> ImageComposite object containing all of the Image objects taken.
	 */
	public ImageComponent make(int numPics, int interval);
	
}
