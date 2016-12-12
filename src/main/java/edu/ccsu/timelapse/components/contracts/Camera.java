package edu.ccsu.timelapse.components.contracts;

import edu.ccsu.timelapse.components.DateFormatted;

/**
 * 
 * Camera Interface
 *
 */
public interface Camera {

	/**
	 * This method takes a picture using the camera attached to the Raspberry Pi.
	 * 
	 * @returns path to image snapped.
	 */
	public String snap();
	
	/**
	 * Gets the timestamp of when the picture was taken
	 * 
	 * @return timestamp in <code>DateFormatted</code> format.
	 */
	public DateFormatted getTimestamp();
	
}
