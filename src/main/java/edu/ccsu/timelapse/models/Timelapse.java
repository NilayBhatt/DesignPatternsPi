package edu.ccsu.timelapse.models;

import java.util.List;
import java.util.Objects;

import edu.ccsu.timelapse.components.Camera;
import edu.ccsu.timelapse.imagecollections.ImageComposite;

/**
 * Timelapse class which represents the timelapse job.
 * 
 *
 */
public class Timelapse {
	
	/**
	 * Collection of frames of timelapse.
	 */
	private List<ImageComposite> frames;
	
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
	 * Create a new instance of a timelapse.
	 */
	public Timelapse() { }
	
	/**
	 * Add a frame to the timelapse.
	 * 
	 * @param image
	 */
	public void addFrame(ImageComposite image) {
		frames.add(image);
	}
	
	/**
	 * Get the list of frames for the timelapse.
	 * 
	 * @return List of ImageComposites
	 */
	public List<ImageComposite> getFrames() {
		
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
	public boolean getRepeat(boolean repeat) {
		
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
	 * Returns the hash code of the pictureName.
	 * 
	 * @return int Hashcode of the tool name and the picture name of this camera
	 */
	@Override
	public int hashCode() {
		
		return Objects.hash(this.width, this.height, this.frames, this.timeBetween);
	}

	/**
	 * Checks if two camera objects are equal
	 * 
	 * @return boolean true when picture names for both <code>Camera</code> objects.
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
		
		if (a.getFrames().toString().compareTo(this.getFrames().toString()) != 0) {
			
			return false;
		}
		
		

		return true;
	}

	
	

}
