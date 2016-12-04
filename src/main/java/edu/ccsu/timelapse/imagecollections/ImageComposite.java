package edu.ccsu.timelapse.imagecollections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

import edu.ccsu.timelapse.components.DateFormatted;
import edu.ccsu.timelapse.models.Image;
import edu.ccsu.timelapse.modifiers.ImageDecorator;

/**
 *	ImageCollection implements the composite pattern. Contains a list of ImageComponent 
 *	and its concrete classes (currently ConcreteImageComponent).
 *
 * 	@author Deepankar Malhan, Edmir Alagic, Lukasz Brodowski, Sabahudin Mujcinovic, Nilay Bhatt
 */
public class ImageComposite implements ImageComponent{
	
	/**
	 * A collection of elements of itself and other concrete classes implementing ImageComponent
	 */
	private List<ImageComponent> elements;
	/**
	 * A name for this composite component to differentiate it from it's children.
	 */
	private String name;

	/**
	 * Creates a new instance of ImageComposite, creating an empty list of children.
	 * 
	 * @param name The name of the compositeComponent.
	 */
	public ImageComposite(String name) {
		elements = new ArrayList<ImageComponent>();
		this.name = name;
	}

	/**
	 * Gets the name for this compositeComponent.
	 * 
	 * @return name of the component.
	 */
	public String getName() {
		return this.name;
	}

	/**
	 * Returns the children of this compositeComponent.
	 * 
	 * @return List of children
	 */
	public List<ImageComponent> getElements() {

		return this.elements;
	}

	public void addComponent(ImageComponent element) {
		this.elements.add(element);
	}
	
	public void removeComponent(ImageComponent element) {
		this.elements.remove(element);
	}
	
	public Iterator<ImageComponent> iterator() {
		return this.elements.iterator();
	}
	
	public Image getImage() {
		// Return null because it is a collection of images
		return null;
	}

	public void decorateComponent(ImageDecorator decorator) {
		// Get an iterator for the children of this ImageComposite.
		Iterator<ImageComponent> compositeIterator = this.iterator();
		
		while(compositeIterator.hasNext()) {
			try {
				// Create a new decorator instance which equals the decorator passed in as the argument but
				// instantiate with the children of this Composite. The goal is to call the decorator's decorate
				// on all the children in this ImageComposite.
				ImageDecorator newDecorator = decorator.getClass()
						.getDeclaredConstructor(new Class[] {ImageComponent.class})
						.newInstance(compositeIterator.next());
				
				/* Call the decorate method in the decorator. Therefore, this will either trigger
				 * the processComponent for decorator passed in (if this ImageComposite's child
				 * passed in the constructor of the newDecorator is actually a ConcreteImageComponent.
				 * If the child was a Composite, the decorator's decorate will come back to this method
				 * but for the child (so recursive). 
				 * This will keep happening recursively until the newDecorator's decorate calls the processComponent.
				 * At which point the call stack starts returning and comes back here. More children? The while loop goes
				 * again, starting the process all over again. No children? Good, return to the parent's newDecorator call
				 * which will go back to here but in the parent ImageComposite. (I promise, I'm done now)
				 */
				newDecorator.decorateComponent(newDecorator);
			} catch (Exception e) {
				e.printStackTrace();
			} 
		}
	}
	
	/**
	 * Returns a String representation of this composite
	 * 
	 * @return String representation of this ImageComposite
	 */
	@Override
	public String toString() {
		
		String output = "";
		
		for (ImageComponent composite : this.elements) {
			output += composite.toString() + " ";
		}
		
		return output;
	}

	/**
	 * Checks if this imageComposite is equal to the one passed in as an argument.
	 * 
	 * @param Other object to compare the calling object to.
	 * @return True if imageComposite are same, false otherwise.
	 */
	@Override
	public boolean equals(Object obj) {
		
		if (!(obj instanceof ImageComponent)) {
			return false;
		}

		ImageComponent otherComponent = (ImageComponent) obj;

		if(this.hashCode() != otherComponent.hashCode()) {
			return false;
		}
		
		return true;

	}

	/**
	 * Returns a hash code of the instance of the class.
	 * 
	 * @return int hash of this object.
	 */
	@Override
	public int hashCode() {
		return Objects.hash(this.getName(), this.getElements());
	}
}
