package edu.ccsu.timelapse.modifiers;
import java.util.Date;
import edu.ccsu.timelapse.models.Image;

/**
 * This is a concrete implementation of ImageDecorator
 * abstract class which specializes adding a timestamp
 * to the image object passed through it
 */
public class ImageTimeDecorator extends ImageDecorator {
	
	/**
	 * Create a new instance of an ImageTimeDecorator.
	 * 
	 * @param toBeDecorated
	 */
    public ImageTimeDecorator(Image toBeDecorated) {
		super(toBeDecorated);
	}
    
    /**
     * Set the timestamp variable of the image 
     * object to the current date-time
     */
    @Override
    public void process() {
    	super.getImage().setTimestamp(new Date());
    }
    
    /**
     * Returns the description of a timestamped image.
     */
    @Override
    public String getDescription() {
    	
        return super.getDescription() + ", including a timestamp.";
    }
}