/**
 * A representation of a single image taken by a <code>Camera</code> instance.
 * 
 * @author Deepankar Malhan, Edmir Alagic, Lukasz Brodowski, Nilay Bhatt, Sabahudin Mujcinovic
 */
package edu.ccsu.cs417.fall16.group4.main;

import java.util.Date;
import java.util.Objects;

public class Image {
	
	private String name;
	private Date created_at;

	/**
	 * Instantiates an <code>Image</code> and gives it a timestamp of creation.
	 * 
	 * @param name Name of the image
	 */
	public Image(String name) {
		this.setName(name);
		this.created_at = new Date();
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		
		return this.name;
	}
	
	public Date getCreatedAt() {
		
		return this.created_at;
	}
	
	@Override
	public String toString() {
		
		return this.name + " was created at: " + created_at.toString() + ".";
	}
	
	@Override
	public int hashCode() {
		
		return Objects.hash(this.name, this.created_at);
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
		
		if(this.getName().equalsIgnoreCase(otherImage.getName())) {
			return true;
		}
		
		return false;
		}
			
		
	}
}
