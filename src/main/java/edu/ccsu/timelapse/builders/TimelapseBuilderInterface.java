package edu.ccsu.timelapse.builders;

import edu.ccsu.timelapse.models.Timelapse;
import edu.ccsu.timelapse.imagecollections.ImageComponent;

/**
 * Interface for a Timelapse builder.
 * 
 */
interface TimelapseBuilderInterface {

	/**
	 * Add frame to timelapse.
	 * 
	 * @param image
	 * @return instance of itself
	 */
	public TimelapseBuilderInterface addFrame(ImageComponent image);
	
	/**
	 * Set time between frames in MS.
	 * 
	 * @param time
	 * @return instance of itself
	 */
	public TimelapseBuilderInterface setTimeBetween(int time);
	
	/**
	 * Set if timelapse repeats.
	 * 
	 * @param repeat
	 * @return instance of itself
	 */
	public TimelapseBuilderInterface setRepeat(boolean repeat);
	
	/**
	 * Set width of timelapse.
	 * 
	 * @param width
	 * @return instance of itself
	 */
	public TimelapseBuilderInterface setWidth(int width);
	
	/**
	 * Set height of timelapse.
	 * 
	 * @param height
	 */
	public TimelapseBuilderInterface setHeight(int height);
	
	/**
	 * Get the result of the builder.
	 * 
	 * @return the built timelapse
	 */
	public Timelapse getResult();
	
}
