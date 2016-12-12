package edu.ccsu.timelapse.imagecollections;

import edu.ccsu.timelapse.models.Image;
import edu.ccsu.timelapse.modifiers.ImageDecorator;

import java.util.Objects;

/**
 * A wrapper for the Image. The reason for this class is to implement all the composite and decorator methods.
 * This keeps our data structure of Image untouched and let's us implement all the logic in here.
 *
 */
public class ConcreteImageComponent implements ImageComponent {
	
	Image image;

	/**
	 * Public constructor
	 */
	public ConcreteImageComponent() {
		this.image = new Image();
	}

	/**
	 * public getter for image
	 * @return Image
	 */
	public Image getImage() {
		return this.image;
	}

	public void decorateComponent(ImageDecorator decorator) {
		// Concrete implementation doesn't need this method.
	}

	/**
	 * toString method for the ConcreteImageComponent.
	 * @return String
	 */
	@Override
	public String toString() {
		return this.image.toString();
	}

	/**
	 * Hash Code for the ConcreteImageComponent object
	 * @return int
	 */
	@Override
	public int hashCode() {
		return Objects.hashCode(this.getImage());
	}

	/**
	 * Equals method for the ConcreteImageComponent.
	 * @param concreteComponent
	 * @return bollean
	 */
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
