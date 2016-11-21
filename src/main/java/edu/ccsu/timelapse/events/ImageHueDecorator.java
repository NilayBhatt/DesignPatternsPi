package edu.ccsu.timelapse.events;
import edu.ccsu.timelapse.models.Image;

/**
 * This is a concrete implementation of ImageDecorator
 * abstract class which specializes in setting and adding
 * an image hue to an image object
 */
public class ImageHueDecorator extends ImageDecorator {
	
	private Double hue;
	
	/**
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
     * @param hue
     */
    private void setHue(Double hue) {
        this.hue = hue;
    }
    
    /**
     * Return image description
     * and include that its been
     * hue-alized kappa.
     */
    @Override
    public String getDescription() {
        return super.getDescription() + ", including an image hue";
    }
}