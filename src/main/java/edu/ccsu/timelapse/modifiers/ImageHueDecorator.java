package edu.ccsu.timelapse.modifiers;

import marvin.image.MarvinImage;
import marvin.io.MarvinImageIO;

/**
 * This is a concrete implementation of ImageDecorator
 * abstract class which specializes in setting and adding
 * an image hue to an image object
 */
public class ImageHueDecorator implements ImageDecorator {
	
	/**
	 * Hue value to be added over image.
	 */
	private int hue;
	
	private ImageDecorator objectToBeDecorated;
	
	/**
	 * Create a new instance of a ImageHueDecorator.
	 * 
	 * @param toBeDecorated
	 */
    public ImageHueDecorator(ImageDecorator decorate, int hue) {
		super();
		
		this.hue = hue;
		
		this.objectToBeDecorated = decorate;
	}

	public void process() {
		
	}
    
//    /**
//     * Return image description of an image with a hue.
//     */
//    @Override
//    public String getDescription() {
//    	
//        return super.getDescription() + ", including an image hue.";
//    }
}