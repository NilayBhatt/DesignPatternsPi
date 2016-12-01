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
    
}