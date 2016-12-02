package edu.ccsu.timelapse.models;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Timelapse class which represents a Timelapse video.
 */
public class Timelapse {
	
	/**
	 * Collection of frames of timelapse.
	 */
	private List<Image> frames;
	
	/**
	 * Time in between frames for in MS.
	 */
	private int timeBetween;
	
	/**
	 * Checks if the timelapse is supposed to repeat.
	 */
	private boolean repeat;
	
	/**
	 * Height of the timelapse.
	 */
	private int height;
	
	/**
	 * Width of the timelapse.
	 */
	private int width;
	
	/**
	 * Create a new instance of a timelapse video with default properties and no frames.
	 */
	public Timelapse() {
		this.frames  = new ArrayList<Image>();
		timeBetween = 0;
		repeat = false;
		height = 0;
		width = 0;
	}
	
	/**
	 * Add a frame to the timelapse.
	 * 
	 * @param image
	 */
	public void addFrame(Image image) {
		frames.add(image);
	}
	
	/**
	 * Get the list of frames for the timelapse.
	 * 
	 * @return List of ImageComposites
	 */
	public List<Image> getFrames() {
		
		return this.frames;
	}
	
	/**
	 * Set the time in between frames in MS.
	 * 
	 * @param time
	 */
	public void setTimeBetween(int time) {
		this.timeBetween = time;
	}
	
	/**
	 * Get the time in between frames.
	 * 
	 * @return time in MS
	 */
	public int getTimeBetween() {
		
		return this.timeBetween;
	}
	
	/**
	 * Set the repeat property on the timelapse.
	 * 
	 * @param repeat
	 */
	public void setRepeat(boolean repeat) {
		this.repeat = repeat;
	}
	
	/**
	 * Get the repeat property on the timelapse.
	 * @param repeat
	 * @return
	 */
	public boolean getRepeat() {
		
		return this.repeat;
	}

	/**
	 * Get the width of the timelapse GIF.
	 * 
	 * @return size of width
	 */
	public int getWidth() {
		
		return this.width;
	}

	/**
	 * Set the width of the timelapse GIF.
	 * 
	 * @param width
	 */
	public void setWidth(int width) {
		this.width = width;
	}

	/**
	 * Get the height of the timelapse GIF.
	 * 
	 * @return the height 
	 */
	public int getHeight() {
		
		return this.height;
	}

	/**
	 * Set the height of the timelapse GIF.
	 * 
	 * @param height
	 */
	public void setHeight(int height) {
		this.height = height;
	}
	

	/**
	 * String representation of a timelapse.
	 */
	@Override
	public String toString() {
		if (! this.repeat) {
			return "A non-repeatbale timelapse with a height of " + this.height + " and a width of " + this.width + ".";
		}
		
		return "A repeatable timelapse with a height of " + this.height + " and a width of " + this.width + ".";
	}

	/**
	 * Returns the hash code of this Timelapse.
	 * 
	 * @return int Hashcode of all the properties as well as all the frames in this Timelapse
	 */
	@Override
	public int hashCode() {
		
		return Objects.hash(this.width, this.height, this.frames, this.timeBetween, this.repeat);
	}

	/**
	 * Checks if two Timelapse objects are equal
	 * 
	 * @return boolean true when properties and frames for both <code>TimeLapse</code> objects are same.
	 */
	@Override
	public boolean equals(Object obj) {
		
		if (! (obj instanceof Timelapse)) {
			
			return false;
		}
		
		Timelapse a = (Timelapse) obj;
		
		if (a.getTimeBetween() != this.getTimeBetween()) {
			
			return false;
		}
		
		if (a.getHeight() != this.getHeight()) {
			
			return false;
		}
		
		if (a.getWidth() != this.getWidth()) {
			
			return false;
		}
		
		if (a.getFrames().hashCode() != this.getFrames().hashCode()) {
			
			return false;
		}
		
		return true;
	}

	
	

}
