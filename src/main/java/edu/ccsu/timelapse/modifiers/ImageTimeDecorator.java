package edu.ccsu.timelapse.modifiers;
import java.util.Date;
import edu.ccsu.timelapse.models.Image;

/**
 * This is a concrete implementation of ImageDecorator
 * abstract class which specializes adding a time stamp
 * to the image object passed through it
 */
public class ImageTimeDecorator extends ImageDecorator {
	
	private Date timestamp;
	
	/**
	 * Create a new instance of an ImageTimeDecorator.
	 * 
	 * @param toBeDecorated
	 */
    public ImageTimeDecorator(Image toBeDecorated) {
		super(toBeDecorated);
		
		this.timestamp = toBeDecorated.getCreatedAt();
	}
    
    /**
     * Set the time stamp variable of the image 
     * object to the current date-time
     */
    @Override
    public void process() {
    	// Water mark time stamp on image;
    }
    
    /**
     * Returns the description of a time stamped image.
     */
    @Override
    public String getDescription() {
    	
        return super.getDescription() + ", including a time stamp.";
    }
}