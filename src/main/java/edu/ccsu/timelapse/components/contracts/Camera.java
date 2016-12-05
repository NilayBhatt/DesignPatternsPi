package edu.ccsu.timelapse.components.contracts;

import edu.ccsu.timelapse.components.DateFormatted;

public interface Camera {

	public String snap();
	
	public DateFormatted getTimestamp();
	
}
