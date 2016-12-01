/**
 * A representation of a single image taken by a <code>Camera</code> instance.
 * 
 * @author Deepankar Malhan, Edmir Alagic, Lukasz Brodowski, Nilay Bhatt, Sabahudin Mujcinovic
 */
package edu.ccsu.timelapse.models;

import java.io.IOException;
import java.util.Date;
import java.util.Objects;

import edu.ccsu.timelapse.imagecollections.ImageComposite;
import edu.ccsu.timelapse.modifiers.ImageDecorator;

/**
 * Image is a model to contain data about images that are taken.
 *
 */
public class Image implements ImageComposite, ImageDecorator{
	
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
		this.setName(name);
		
		this.properties = new Properties(new Date());
	}
	
	/**
	 * Set the name of the image.
	 * 
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	
	/**
	 * Get the name of the image.
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
	public Date getCreatedAt() {
		
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
	public void setBrightness(int brightness) {
		this.properties.brightness = brightness;
	}
	
	/**
	 * Setter for the temperature property.
	 * 
	 * @param temperature
	 */
	public void setTemperature(int temperature) {
		this.properties.tempurature = temperature;
	}
	
	/**
	 * Returns a string representation of the class.
	 */
	@Override
	public String toString() {
		
		return this.name + " was created at: " + this.properties.created_at + ".";
	}
	
	/**
	 * Returns a hash code of the instance of the class.
	 */
	@Override
	public int hashCode() {
		
		return Objects.hash(this.name, this.properties.created_at);
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
		
		if(! this.getName().equals(otherImage.getName())) {
			
			return false;
		}
		
		return true;
	}
	
	/**
	 * This decorate method decorates this image using any decorator passed through as an argument.
	 */
	public void decorate(ImageDecorator decorator) throws IOException {
		decorator.process(this);
	}
	
	/**
	 * This method has to be implemented due to image being the object that is being decorated.
	 * @param imageToBeDecorated
	 */
	public void process(Image imageToBeDecorated) {}	
	
	private class Properties {
		
		/**
		 * Time stamp of image taken
		 */
		Date created_at;
		
		/**
		 * Temperature value at the time the image was taken.
		 */
		int tempurature;
		
		/**
		 * Value of hue applied to image.
		 */
		int hue;
		
		/**
		 * Brightness of image.
		 */
		int brightness;
		
		/**
		 * Create a new instance of Properties.
		 * 
		 * @param created_at
		 * @param brightness
		 * @param hue
		 * @param temperature
		 */
		Properties(Date created_at) {
			
			this.created_at = created_at;
			this.brightness = 0;
			this.hue = 0;
			this.tempurature = 0;
		}
	}	
}
