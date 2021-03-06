package edu.ccsu.timelapse.builders;

import java.util.Iterator;
import java.util.Objects;

import edu.ccsu.timelapse.models.Timelapse;
import edu.ccsu.timelapse.imagecollections.*;

/**
 * Timelapse director for building timelapses.
 *
 */
public class TimelapseDirector {
	
	/**
	 * Instace of builder.
	 */
	private TimelapseBuilderInterface builder;
	
	/**
	 * Create a new instance of a TimelapseDirector.
	 * 
	 * @param builder
	 */
	public TimelapseDirector(TimelapseBuilderInterface builder) {
		this.builder = builder;
	}
	
	/**
	 * Construct a timelapse.
	 * 
	 * @return the timelapse
	 */
	public Timelapse construct() {
		this.builder.setHeight(600).setWidth(800).setRepeat(true).setTimeBetween(100);
		
		return this.builder.getResult();
	}
	
	/**
	 * Construct a timelapse with a image collection.
	 * 
	 * @param images
	 * @return the timelapse
	 */
	public Timelapse construct(ImageComposite images) {
		this.builder.setHeight(600).setWidth(800).setRepeat(true).setTimeBetween(100);
		
		Iterator<ImageComponent> iteratorImages = images.iterator();
		
		while(iteratorImages.hasNext()) {
			ImageComponent currentComponent = iteratorImages.next();
			
			if(currentComponent instanceof ConcreteImageComponent) {
				this.builder.addFrame(currentComponent);
			}
			else if (currentComponent instanceof ImageComposite) {
				this.construct((ImageComposite) currentComponent);
			}
		}
			
		return this.builder.getResult();
		
	}
	
	/**
	 * String representation of this object.
	 * 
	 * @return string
	 */
	@Override
	public String toString() {
		return "This is the TimelapseDirector.";
	}
	
	/**
	 * Hash code of this object.
	 * 
	 * @return int hashCode
	 */
	@Override
	public int hashCode() {
		return Objects.hashCode(this);
	}
	
	/**
	 * Checks if the two objects are equal.
	 * 
	 * @return true if equal
	 */
	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof TimelapseDirector) && (this.hashCode() != ((TimelapseDirector)obj).hashCode())) {
			return false;
		}
		
		return true;
	}
}
