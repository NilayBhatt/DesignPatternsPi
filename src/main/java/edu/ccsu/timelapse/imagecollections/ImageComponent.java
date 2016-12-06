package edu.ccsu.timelapse.imagecollections;

import edu.ccsu.timelapse.models.Image;
import edu.ccsu.timelapse.modifiers.ImageDecorator;

/**
 * Interface defining methods for the composite and the decorator pattern.
 * 
 */
public interface ImageComponent {
	
	/**
	 * A method to decorate the calling Component with the decorator passed in as an argument.
	 * This will not do anything if called on a Concrete implementation (image shouldn't decorate itself).
	 * But a composite's decorateComponent method will take all the children in the composite and call 
	 * a new instance of the decorator that's been passed in. It takes this new instance and calls
	 * its decorate method, so the newDecorator will decorate the children.
	 * 
	 * @param decorator
	 */
	public void decorateComponent(ImageDecorator decorator);
	
	/**
	 * Gets the image from this component. <code>null</code> for ImageComposite as it contains
	 * a collection of images. This method is present in this interface to make it easier for
	 * the Decorators to access the image that they will decorate.
	 * 
	 * @return image
	 */
	public Image getImage();
}
