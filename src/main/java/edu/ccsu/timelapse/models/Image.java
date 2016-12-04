/**
 * A representation of a single image taken by a <code>Camera</code> instance.
 * 
 * @author Deepankar Malhan, Edmir Alagic, Lukasz Brodowski, Nilay Bhatt, Sabahudin Mujcinovic
 */
package edu.ccsu.timelapse.models;

import java.util.Objects;

import edu.ccsu.timelapse.components.DateFormatted;

/**
 * Image is a model to contain data about images that are taken.
 * 
 * @author Deepankar Malhan, Edmir Alagic, Lukasz Brodowski, Sabahudin Mujcinovic, Nilay Bhatt
 */
public class Image { 
	
	private String path;
	
	private int temperature;
	
	private DateFormatted timestamp;

	/**
	 * Create a new instance of an image.
	 * 
	 */
	public Image() {}
	
	
	public void setPath(String path) {
		
		this.path = path;
	}
	
	/**
	 * Get the path of the image
	 * 
	 * @return the path
	 */
	public String getPath() {
		
		return this.path;
	}

	/**
	 * Setter for the temperature property.
	 * 
	 * @param temperature
	 */
	public void setTemperature(int temperature) {
		this.temperature = temperature;
	}
	
	/**
	 * Getter for the temperature property.
	 * @return temperature
	 */
	public int getTemperature() {
		
		return this.temperature;
	}
	
	public DateFormatted getTimestamp() {
		
		return this.timestamp;
	}


	public void setTimestamp(DateFormatted date) {
		this.timestamp = date;
	}
	

	/**
	 * Returns a string representation of the class.
	 */
	@Override
	public String toString() {
		
		return "An image with a path of \"" + this.getPath() + "\", temperature of: " + this.temperature +
				"and created at: " + this.timestamp;
	}
	
	/**
	 * Returns a hash code of the instance of the class.
	 */
	@Override
	public int hashCode() {
		
		return Objects.hash(this.getPath(), this.getTimestamp(), this.getTemperature());
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
}
