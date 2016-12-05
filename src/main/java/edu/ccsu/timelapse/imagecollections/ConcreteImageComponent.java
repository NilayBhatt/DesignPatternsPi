package edu.ccsu.timelapse.imagecollections;

import edu.ccsu.timelapse.models.Image;
import edu.ccsu.timelapse.modifiers.ImageDecorator;

import java.util.Objects;

/**
 * A wrapper for the Image. The reason for this class is to implement all the composite and decorator methods.
 * This keeps our data structure of Image untouched and let's us implement all the logic in here.
 *
 */
public class ConcreteImageComponent implements ImageComponent{
	
	private Image image;
	
	public ConcreteImageComponent() {
		this.image = new Image();
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
