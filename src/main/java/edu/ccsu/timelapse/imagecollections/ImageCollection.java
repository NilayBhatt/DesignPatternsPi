/**
 *	ImageCollection implements the composite pattern. Contains an arraylist of ImageComposite 
 *	and its concrete classes (currently Image).
 *
 * 	@author Deepankar Malhan, Edmir Alagic, Lukasz Brodowski, Sabahudin Mujcinovic, Nilay Bhatt
 */

package edu.ccsu.timelapse.imagecollections;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;

import edu.ccsu.timelapse.models.Image;
import edu.ccsu.timelapse.modifiers.ImageDecorator;

public class ImageCollection implements ImageComposite{
	
	/**
	 * A collection of elements of itself and other concrete classes implementing ImageComposite
	 */
	private ArrayList<ImageComposite> elements;

	public ImageCollection() {
		elements = new ArrayList<ImageComposite>();
	}
	
	/**
	 *  This decorate method decorates all the images inside this specific composite ImageCollection
	 * @throws IOException 
	 */
	public void decorate(ImageDecorator decorator) throws IOException {
		
		Iterator<ImageComposite> elementsIterator = elements.iterator();
		
		while(elementsIterator.hasNext()) {
			elementsIterator.next().decorate(decorator);
		}
	}

	/**
	 * Reuturns the current collection of ImageCompsite elements
	 * @return the ArrayList of ImageCompsite objects
	 */
	public ArrayList<ImageComposite> getElements() {

		return this.elements;
	}
	/**
	 * Adding elements to this specific composite's sub-elements.
	 * @param element
	 */
	public void addElements(ImageComposite element) {
		elements.add(element);
	}
	
	/**
	 * Remove a specific sub-element from this collection
	 * @param element
	 * @return True if removal was successful
	 */
	public boolean removeElement(ImageComposite element) {
		return elements.remove(element);
	}
	
	/**
	 * Returns a String representation of this composite with each sub composite being represented inside { and }
	 * 
	 * @return String representation of this imageCollection
	 */
	@Override
	public String toString() {
		
		String output = "";
		
		for (ImageComposite composite : this.elements) {
			output += composite.toString() + " ";
		}
		
		return output;
	}

	/**
	 * Checks if this imageCollection is equal to the one passed in as an argument.
	 * @return True if imageCollections are same, false otherwise.
	 */
	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (!(o instanceof ImageCollection)) return false;

		ImageCollection that = (ImageCollection) o;

		return getElements() != null ? getElements().equals(that.getElements()) : that.getElements() == null;

	}

	/**
	 * Returns a hash code of the instance of the class.
	 */
	@Override
	public int hashCode() {
		return getElements() != null ? getElements().hashCode() : 0;
	}
}
