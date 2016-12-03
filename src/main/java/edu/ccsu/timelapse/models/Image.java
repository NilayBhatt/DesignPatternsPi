/**
 * A representation of a single image taken by a <code>Camera</code> instance.
 * 
 * @author Deepankar Malhan, Edmir Alagic, Lukasz Brodowski, Nilay Bhatt, Sabahudin Mujcinovic
 */
package edu.ccsu.timelapse.models;

import java.util.Date;
import java.util.Objects;

import edu.ccsu.timelapse.components.DateFormatted;
import edu.ccsu.timelapse.imagecollections.ImageComponent;

/**
 * Image is a model to contain data about images that are taken.
 *
 */
public class Image extends ImageComponent{ 
	
	/**
	 * Name of image.
	 */
	private String name;
	
	/**
	 * Image properties;
	 */
	private Properties properties;
	
	
	/**
	 * Create a new instance of an image.
	 * 
	 * @param name Name of the image
	 */
	public Image(String name) {
		this.name = name;
		this.properties = new Properties(DateFormatted.getInstance().formatDate(new Date()));
	}
	
	
	/**
	 * Get the name of the image which the creation time.
	 * 
	 * @return the name
	 */
	public String getName() {
		
		return this.name;
	}
	
	/**
	 * Get the created at date.
	 * 
	 * @return the date the image was created
	 */
	public String getCreatedAt() {
		
		return this.properties.created_at;
	}
	
	/**
	 * Setter for the hue property.
	 * 
	 * @param hue
	 */
	public void setHue(int hue) {
		this.properties.hue = hue;
	}

	/**
	 * Getter for the hue property
	 * @return hue
	 */
	public int getHue() {
		return this.properties.hue;
	}
	/**
	 * Setter for the brightness property.
	 * 
	 * @param brightness
	 */

	/**
	 * Setter for the temperature property.
	 * 
	 * @param temperature
	 */
	public void setTemperature(double temperature) {
		this.properties.temperature = temperature;
	}
	
	/**
	 * Getter for the temperature property.
	 * @return temperature
	 */
	public double getTemperature() {
		return this.properties.temperature;
	}
	
	/**
	 * Returns a string representation of the class.
	 */
	@Override
	public String toString() {
		
		return "This image was created at: " + this.properties.created_at + " with temp: " +
		this.properties.temperature + ", hue: " + this.properties.hue + ".";
	}
	
	/**
	 * Returns a hash code of the instance of the class.
	 */
	@Override
	public int hashCode() {
		
		return Objects.hash(this.name, this.properties);
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
	
	private class Properties {
		
		/**
		 * Time stamp of image taken
		 */
		
		String created_at;
		
		/**
		 * Temperature value at the time the image was taken.
		 */
		double temperature;
		
		/**
		 * Value of hue applied to image.
		 */
		int hue;
		
		/**
		 * Create a new instance of Properties.
		 * 
		 * @param created_at
		 * @param brightness
		 * @param hue
		 * @param temperature
		 */
		// Change argument type to take Date wrapper
		Properties(String created_at) {
			
			this.created_at = created_at;
			this.hue = 0;
			this.temperature = 0.0;
		}
	}

	@Override
	public void processComponent() {
		// TODO Auto-generated method stub
		
	}	
}
