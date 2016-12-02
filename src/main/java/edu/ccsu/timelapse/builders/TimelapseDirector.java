package edu.ccsu.timelapse.builders;

import java.util.List;

import edu.ccsu.timelapse.models.Image;
import edu.ccsu.timelapse.models.Timelapse;

/**
 * Timelapse director for building timelapses.
 *
 */
public class TimelapseDirector {
	
	/**
	 * Instace of builder.
	 */
	private TimelapseBuilderInterface builder;
	
	/**
	 * Create a new instance of a TimelapseDirector.
	 * 
	 * @param builder
	 */
	public TimelapseDirector(TimelapseBuilderInterface builder) {
		this.builder = builder;
	}
	
	/**
	 * Construct a timelapse.
	 * 
	 * @return the timelapse
	 */
	public Timelapse construct() {
		this.builder.setHeight(600).setWidth(800).setRepeat(true).setTimeBetween(100);
		
		return this.builder.getResult();
	}
	
	/**
	 * Construct a timelapse with a image collection.
	 * 
	 * @param images
	 * @return the timelapse
	 */
	public Timelapse construct(List<Image> images) {
		this.builder.setHeight(600).setWidth(800).setRepeat(true).setTimeBetween(100);
		
		for (Image image : images) {
			this.builder.addFrame(image);
		}
			
		return this.builder.getResult();
		
	}
}
