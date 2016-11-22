/**
 *	ImageCollection implements the composite pattern. Contains an arraylist of ImageComposite 
 *	and its concrete classes (currently Image).
 *
 * 	@author Deepankar Malhan, Edmir Alagic, Lukasz Brodowski, Sabahudin Mujcinovic, Nilay Bhatt
 */

package edu.ccsu.timelapse.imagecollections;

import java.util.ArrayList;
import java.util.Iterator;
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
	 */
	public void decorate(ImageDecorator decorator) {
		
		Iterator<ImageComposite> elementsIterator = elements.iterator();
		
		while(elementsIterator.hasNext()) {
			elementsIterator.next().decorate(decorator);
		}
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
	
}
