package edu.ccsu.timelapse.modifiers;
import edu.ccsu.timelapse.models.Image;

/**
 * This abstract class helps create concrete decorators
 * that specialize in adding an image hue, timestamp,
 * and whatever else we are doing later.
 */
abstract class ImageDecorator {
	
	/**
	 * Image to be decorated.
	 */
	private Image imageToBeDecorated;
	
	/**
	 * Creates new instance of an ImageDecorator.
	 * 
	 * @param toBeDecorated
	 */
    public ImageDecorator (Image toBeDecorated) {
        this.imageToBeDecorated = toBeDecorated;
    }
    
    /**
     * Abstract method process to be
     * overridden in concrete decorators.
     */
    public abstract void process();
   
    /**
     * Get the description of an image.
     * 
     * @return string of image description
     */
    public String getDescription() {
    	
        return this.imageToBeDecorated.toString();
    }
    
    /**
     * Get the image instance.
     * 
     * @return the private image object stored above
     */
    public Image getImage() {
    	
    	return this.imageToBeDecorated;
    }
}