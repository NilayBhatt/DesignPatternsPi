/**
 *	ImageCollection implements the composite pattern. Contains an arraylist of ImageComposite 
 *	and its concrete classes (currently Image).
 *
 * 	@author Deepankar Malhan, Edmir Alagic, Lukasz Brodowski, Sabahudin Mujcinovic, Nilay Bhatt
 */

package edu.ccsu.timelapse.imagecollections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public class ImageComposite extends ImageComponent{
	
	/**
	 * A collection of elements of itself and other concrete classes implementing ImageComposite
	 */
	private List<ImageComponent> elements;

	public ImageComposite() {
		elements = new ArrayList<ImageComponent>();
	}

	/**
	 * Returns the current collection of ImageCompsite elements
	 * @return the ArrayList of ImageCompsite objects
	 */
	public List<ImageComponent> getElements() {

		return this.elements;
	}
	/**
	 * Adding elements to this specific composite's sub-elements.
	 * @param element
	 */
	public void addElements(ImageComponent element) {
		elements.add(element);
	}
	
	/**
	 * Remove a specific sub-element from this collection
	 * @param element
	 * @return True if removal was successful
	 */
	public boolean removeElement(ImageComponent element) {
		return elements.remove(element);
	}
	
	/**
	 * Returns an iterator of the ImageComposite
	 * @return iterator
	 */
	public Iterator<ImageComponent> iterator() {
		return elements.iterator();
	}
	

	/**
	 * Process the component with this implementation for composite going through itself and calling process on
	 * its children.
	 */
	@Override
	public void processComponent() {
		Iterator<ImageComponent> componentIterator = this.elements.iterator();
		
		while(componentIterator.hasNext()) {
			componentIterator.next().processComponent();
		}
	}
	
	/**
	 * Returns a String representation of this composite with each sub composite being represented inside { and }
	 * 
	 * @return String representation of this imageCollection
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
	 * Checks if this imageCollection is equal to the one passed in as an argument.
	 * @return True if imageCollections are same, false otherwise.
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
	 */
	@Override
	public int hashCode() {
		return Objects.hashCode(this.elements);
	}
}
