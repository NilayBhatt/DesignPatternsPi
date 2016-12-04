/**
 * A representation of a single image taken by a <code>Camera</code> instance.
 * 
 * @author Deepankar Malhan, Edmir Alagic, Lukasz Brodowski, Nilay Bhatt, Sabahudin Mujcinovic
 */
package edu.ccsu.timelapse.models;

import java.util.Objects;

import edu.ccsu.timelapse.components.DateFormatted;
import edu.ccsu.timelapse.imagecollections.ImageComponent;

/**
 * Image is a model to contain data about images that are taken.
 *
 */
public class Image extends ImageComponent { 
	
	private String path;
	
	private int temperature;
	
	private DateFormatted timestamp;

	/**
	 * Create a new instance of an image.
	 * 
	 * @param name Name of the image
	 */
	public Image() { }
	
	
	@Override
	public ImageComponent setPath(String path) {
		
		this.path = path;
		
		return this;
	}
	
	/**
	 * Get the path of the image
	 * 
	 * @return the path
	 */
	@Override
	public String getPath() {
		
		return this.path;
	}

	/**
	 * Setter for the temperature property.
	 * 
	 * @param temperature
	 */
	@Override
	public ImageComponent setTemperature(int temperature) {
		this.temperature = temperature;
		
		return this;
	}
	
	/**
	 * Getter for the temperature property.
	 * @return temperature
	 */
	@Override
	public int getTemperature() {
		
		return this.temperature;
	}
	
	@Override
	public DateFormatted getTimestamp() {
		
		return this.timestamp;
	}


	@Override
	public ImageComponent setTimestamp(DateFormatted date) {
		this.timestamp = date;
		
		return this;
	}
	

	/**
	 * Returns a string representation of the class.
	 */
	@Override
	public String toString() {
		
		return "An image with a path of " + this.getPath();
	}
	
	/**
	 * Returns a hash code of the instance of the class.
	 */
	@Override
	public int hashCode() {
		
		return Objects.hashCode(this.getPath());
	}
	
	/**
	 * Returns true if the Image names match.
	 * 
	 * @param image The image to be compared to this instance of Image.
	 */
	@Override
	public boolean equals(Object image) {
		
		if(!(image instanceof Image)) {
			
			return false;
		}
		
		Image otherImage = (Image) image;
		
		if(this.hashCode() != otherImage.hashCode()) {
			
			return false;
		}
		
		return true;
	}


	@Override
	public void processComponent() {
		// TODO Auto-generated method stub
		
	}
	
}
