package edu.ccsu.timelapse.modifiers;
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
	
	/**
	 * Create a new instance of a ImageHueDecorator.
	 * 
	 * @param toBeDecorated
	 */
    public ImageHueDecorator(int hue) {
		super();
		
		this.hue = hue;
	}
    
    /**
     * An override of the process 
     * requires hue to be set before processing
     * then pushes the hue up to the image object
     */
    @Override
    public void process(Image imageToBeDecorated) {
    	imageToBeDecorated.setHue(this.hue);
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