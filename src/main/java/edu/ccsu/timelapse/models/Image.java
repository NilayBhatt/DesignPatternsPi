/**
 * A representation of a single image taken by a <code>Camera</code> instance.
 * 
 * @author Deepankar Malhan, Edmir Alagic, Lukasz Brodowski, Nilay Bhatt, Sabahudin Mujcinovic
 */
package edu.ccsu.timelapse.models;

import java.util.Date;
import java.util.Objects;

/**
 * Image is a model to contain data about images that are taken.
 *
 */
public class Image {
	
	/**
	 * Name of image.
	 */
	private String name;
	
	/**
	 * Timestamp of image taken
	 */
	private Date timestamp;
	
	/**
	 * Temperature value at the time the image was taken.
	 */
	private Double tempurature;
	
	/**
	 * Value of hue applied to image.
	 */
	private Double hue;
	
	/**
	 * Create a new instance of an image.
	 * 
	 * @param name Name of the image
	 */
	public Image(String name) {
		this.setName(name);
		this.tempurature = 0.0;
		this.hue = 0.0;
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
	 * Set the hue of the image.
	 * 
	 * @param hue
	 */
	public void setHue(Double hue) {
		this.hue = hue;
	}
	
	/**
	 * Get the hue of the image.
	 * 
	 * @return value of the hue
	 */
	public double getHue() {
		
		return this.hue;
	}
	
	/**
	 * Set the timestamp of the image.
	 * 
	 * @param timestamp
	 */
	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}
	
	/**
	 * Get the timestamp of the image.
	 * 
	 * @return the timestamp
	 */
	public Date getTimestamp() {
		
		return this.timestamp;
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
	 * @return created at Date object
	 */
	public Date getCreatedAt() {
		
		return this.timestamp;
	}
	
	/**
	 * Returns a string representation of the class.
	 */
	@Override
	public String toString() {
		
		return this.name + " was created at: " + timestamp.toString() + ".";
	}
	
	/**
	 * Returns a hash code of the instance of the class.
	 */
	@Override
	public int hashCode() {
		
		return Objects.hash(this.name, this.timestamp);
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
			
}
