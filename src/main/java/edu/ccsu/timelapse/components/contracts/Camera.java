package edu.ccsu.timelapse.components.contracts;

import edu.ccsu.timelapse.components.DateFormatted;

/**
 * 
 * Camera Interface
 *
 */
public interface Camera {

	/**
	 * Takes the picture
	 * @return String of the file Path
	 */
	public String snap();
	
	/**
	 * Returns the time stamp
	 * @return DateFormatted
	 */
	public DateFormatted getTimestamp();
	
}
