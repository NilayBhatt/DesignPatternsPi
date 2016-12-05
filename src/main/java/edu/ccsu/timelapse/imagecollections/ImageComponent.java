package edu.ccsu.timelapse.imagecollections;

import java.util.Iterator;

import edu.ccsu.timelapse.models.Image;
import edu.ccsu.timelapse.modifiers.ImageDecorator;

/**
 * Interface defining methods for the composite and the decorator pattern.
 * 
 */
public interface ImageComponent {
	
	/**
	 * Add an element to the calling ImageComponent. If the Component is a ConcreteComponent,
	 * this won't do anything. However, if the Component is a CompositeComponent,
	 * then this component is added to the children of the CompoisteComponent that called
	 * this method. 
	 * 
	 * @param component
	 */
	public void addComponent(ImageComponent component);
	
	/**
	 * Remove an element from the calling ImageComponent. If the Component is a ConcreteComponent,
	 * this won't do anything. However, if the Component is a CompositeComponent,
	 * then this component is removed from the children of the CompoisteComponent that called
	 * this method.
	 *  
	 * @param component
	 */
	public void removeComponent(ImageComponent component);
	
	/**
	 * Return an iterator to iterate over the ImageComponent.
	 * 
	 * @return iterator
	 */
	public Iterator<ImageComponent> iterator();
	
	/**
	 * Accessor method to be used by Decorators. If calling Component is composite,
	 * the method returns null because it contains a collection of images. Otherwise, return
	 * the Image stored inside the ConcreteImageComponent.
	 * 
	 * @return image
	 */
	public Image getImage();
	
	/**
	 * A method to decorate the calling Component with the decorator passed in as an argument.
	 * This will not do anything if called on a Concrete implementation (image shouldn't decorate itself).
	 * But a composite's decorateComponent method will take all the children in the composite and call 
	 * a new instance of the decorator that's been passed in. It takes this new instance and calls
	 * its decorate method, so the newDecorator will decorate the children.
	 * 
	 * @param decorator
	 */
	public abstract void decorateComponent(ImageDecorator decorator);
}
