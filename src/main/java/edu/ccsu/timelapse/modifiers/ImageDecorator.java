package edu.ccsu.timelapse.modifiers;
import edu.ccsu.timelapse.models.Image;

import java.io.IOException;

/**
 * This abstract class helps create concrete decorators
 * that specialize in adding an image hue, timestamp,
 * and whatever else we are doing later.
 */
public interface ImageDecorator {
	    
    /**
     * Abstract method process to be
     * overridden in concrete decorators.
     */
    public abstract void process(Image imageToBeDecorated) throws IOException;
   
//    /**
//     * Get the description of an image.
//     * 
//     * @return string of image description
//     */
//    public String getDescription() {
//    	
//        return this.imageToBeDecorated.toString();
//    }
//    
//    /**
//     * Get the image instance.
//     * 
//     * @return the private image object stored above
//     */
//    public Image getImage() {
//    	
//    	return this.imageToBeDecorated;
//    }
}