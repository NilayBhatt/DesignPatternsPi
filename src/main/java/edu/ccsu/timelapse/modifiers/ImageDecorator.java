package edu.ccsu.timelapse.modifiers;

import java.util.Objects;

import edu.ccsu.timelapse.imagecollections.*;
import edu.ccsu.timelapse.models.Image;

/**
 * This abstract class helps create concrete decorators that specialize in adding an image hue, and timestamp.
 * Many of the methods used in composite pattern have been implemented here so that subclasses don't have to
 * deal with them. By default, these methods delegate the work back to the composite pattern classes for composite
 * methods in this class.
 *
 */
public abstract class ImageDecorator implements ImageComponent {
	
	/**
	 * Protected ImageComponent that needs to be decorated. Could be composite or concrete
	 * implementation of ImageComponent. It's protected because it needs to be accessed by the 
	 * specialized subclasses.
	 */
	protected ImageComponent toBeDecorated;
	
	/**
	 * Initializes the decorator with the ImageComponent(Concrete or Composite) that needs to be decorated.
	 * 
	 * @param toBeDecorated ImageComponent to be decorated.
	 */
	public ImageDecorator(ImageComponent toBeDecorated) {
		this.toBeDecorated = toBeDecorated;
	}
	
	public Image getImage() {
		return this.toBeDecorated.getImage();
	}
	
	/**
	 * This method looks at the type of ImageComponent stored as an instance variable in this class.
	 * If the component is a concrete component, meaning decorators can physically edit the file, delegate the work
	 * to decorator that was passed in.
	 * If the component is actually composite, call the decorate method on the variable. This will invoke the composite
	 * decorate method for the instance variable. That method will in return deconstruct this composite, and iterate over it's list
	 * of children. While iterating, the composite's decorate method, initializes a new decorator using this decorator object.
	 * Now, the newDecorator (identical to this one, except with toBeDecorated having one of the child objects of this object's 
	 * toBeDecorated) will call this method. This method again looks at the child and checks if the child is composite or concrete.
	 * This keeps going until we reach the deepest part of the composite and going back up the tree each Concrete component gets decorated 
	 * by the processComponent method.
	 * 
	 * @param This object itself to be used in the Reflection API used by the decorate method in ImageComposite.
	 */
	public void decorateComponent(ImageDecorator decorator) {
		
		if(this.toBeDecorated instanceof ImageComposite) {
			System.out.println("SENT IT BACK");
			this.toBeDecorated.decorateComponent(this);
		}
		else if(this.toBeDecorated instanceof ConcreteImageComponent){
			decorator.processComponent();
			System.out.println("CALL PROCESS");
		}
	}
	
	/**
	 * Abstract method that needs to be implemented by all the subclasses. This method physically opens and decorates 
	 * the concrete components using toBeDecorated from this class.
	 */
	public abstract void processComponent();
	
	/**
	 * String representation of the ImageComponent that will be deocrated.
	 * 
	 * @return String
	 */
	@Override
	public String toString() {
		return this.toBeDecorated.toString();
	}
	
	/**
	 * Returns the hash code of the object to be decorated.
	 * 
	 * @return int hashCode for this object.
	 */
	@Override
	public int hashCode() {
		return Objects.hashCode(this.toBeDecorated);
	}
	
	/**
	 * Checks if the decorator passed in is the same as this one.
	 * 
	 * @return true if equal objects
	 */
	@Override
	public boolean equals(Object decorator) {
		if(!(decorator instanceof ImageDecorator)) {
			return false;
		}
		
		ImageDecorator otherObj = (ImageDecorator) decorator;
		
		if(this.hashCode() != otherObj.hashCode()) {
			return false;
		}
		
		return true;
	}
}