package edu.ccsu.timelapse.factories;

import edu.ccsu.timelapse.imagecollections.ImageComponent;

/**
 * An interface for all of the different styles of image
 * objects we want to create.
 */
public interface ImageFactoryInterface {
	
	/**
	 * Creates an Image object based on the properties specified 
	 * in the parameters.
	 * 
	 * @param String path
	 * @param int temperature
	 * @param String timestamp
	 * @return ImageComponent -> Image object with the specified properties
	 */
	public ImageComponent make(String path, int temperature, String timestamp);
	
}
