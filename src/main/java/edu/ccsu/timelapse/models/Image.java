/**
 * A representation of a single image taken by a <code>Camera</code> instance.
 * 
 * @author Deepankar Malhan, Edmir Alagic, Lukasz Brodowski, Nilay Bhatt, Sabahudin Mujcinovic
 */
package edu.ccsu.timelapse.models;

import java.util.Date;
import java.util.Objects;

public class Image {
	
	private String name;
	private Date timestamp;
	private Double tempurature;
	private Double hue;
	
	/**
	 * Instantiates an <code>Image</code> and gives it a timestamp of creation.
	 * 
	 * @param name Name of the image
	 */
	public Image(String name) {
		this.setName(name);
		this.tempurature = 0.0;
		this.hue = 0.0;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setHue(Double hue){
		this.hue = hue;
	}
	
	public double getHue(){
		return this.hue;
	}
	
	public void setTimestamp(Date timestamp){
		this.timestamp = timestamp;
	}
	
	public Date getTimestamp(){
		return this.timestamp;
	}
	
	public String getName() {
		
		return this.name;
	}
	
	public Date getCreatedAt() {
		
		return this.timestamp;
	}
	
	@Override
	public String toString() {
		
		return this.name + " was created at: " + timestamp.toString() + ".";
	}
	
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
