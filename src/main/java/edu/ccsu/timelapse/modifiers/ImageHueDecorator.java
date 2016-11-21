package edu.ccsu.timelapse.modifiers;
import edu.ccsu.timelapse.models.Image;

/**
 * This is a concrete implementation of ImageDecorator
 * abstract class which specializes in setting and adding
 * an image hue to an image object
 */
public class ImageHueDecorator extends ImageDecorator {
	
	/**
	 * Hue value to be added over image.
	 */
	private Double hue;
	
	/**
	 * Create a new instance of a ImageHueDecorator.
	 * 
	 * @param toBeDecorated
	 */
    public ImageHueDecorator(Image toBeDecorated) {
		super(toBeDecorated);
	}
    
    /**
     * An override of the process 
     * requires hue to be set before processing
     * then pushes the hue up to the image object
     */
    @Override
    public void process() {
    	if(this.hue != null){
    		super.getImage().setHue(this.hue);
    	}
    }
    
    /**
     * Set the local private variable hue,
     * this should be set before processing.
     * 
     * @param hue
     */
    private void setHue(Double hue) {
        this.hue = hue;
    }
    
    /**
     * Return image description of an image with a hue.
     */
    @Override
    public String getDescription() {
    	
        return super.getDescription() + ", including an image hue.";
    }
}