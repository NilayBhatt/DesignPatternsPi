package edu.ccsu.timelapse.modifiers;
import java.io.IOException;

import edu.ccsu.timelapse.models.Image;

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

	@Override
	public void process() {
		// TODO Auto-generated method stub
		
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