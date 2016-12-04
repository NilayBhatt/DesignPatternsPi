package edu.ccsu.timelapse.imagecollections;

import java.util.Iterator;
import java.util.Objects;

import edu.ccsu.timelapse.models.Image;
import edu.ccsu.timelapse.modifiers.ImageDecorator;

/**
 * A wrapper for the Image. The reason for this class is to implement all the composite and decorator methods.
 * This keeps our data structure of Image untouched and let's us implement all the logic in here.
 * 
 * @author Deepankar Malhan, Edmir Alagic, Lukasz Brodowski, Sabahudin Mujcinovic, Nilay Bhatt
 *
 */
public class ConcreteImageComponent implements ImageComponent{
	
	Image image;
	
	public ConcreteImageComponent() {
		this.image = new Image();
	}

	public void addComponent(ImageComponent component) {
		// Concrete implementation doesn't need this method.
	}

	public void removeComponent(ImageComponent component) {
		// Concrete implementation doesn't need this method.
	}

	public Iterator<ImageComponent> iterator() {
		// Concrete implementation doesn't need this method.
		return null;
	}

	public Image getImage() {
		return this.image;
	}

	public void decorateComponent(ImageDecorator decorator) {
		// Concrete implementation doesn't need this method.
	}
	
	@Override
	public String toString() {
		return this.image.toString();
	}
	
	@Override
	public int hashCode() {
		return Objects.hashCode(this.getImage());
	}
	
	@Override
	public boolean equals(Object concreteComponent) {
		if(!(concreteComponent instanceof ConcreteImageComponent)) {
			return false;
		}
		
		ConcreteImageComponent otherObj = (ConcreteImageComponent) concreteComponent;
		
		if(this.hashCode() != otherObj.hashCode()) {
			return false;
		}
		
		return true;
	}

}
