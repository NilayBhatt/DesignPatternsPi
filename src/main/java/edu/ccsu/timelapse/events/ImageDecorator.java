package edu.ccsu.timelapse.events;
import edu.ccsu.timelapse.models.Image;

/**
 * This abstract class helps create concrete decorators
 * that specialize in adding an image hue, timestamp,
 * and whatever else we are doing later.
 */
abstract class ImageDecorator {
	
	private Image imageToBeDecorated;
	
	/**
	 * Creates ImageDecorator object
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
     * 
     * @return string of image description
     */
    public String getDescription() {
        return this.imageToBeDecorated.toString();
    }
    
    /**
     * 
     * @return the private image object stored above
     */
    public Image getImage() {
    	return this.imageToBeDecorated;
    }
}