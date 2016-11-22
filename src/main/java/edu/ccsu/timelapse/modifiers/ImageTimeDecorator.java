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
    public ImageTimeDecorator() {
		super();
		
		this.timestamp = new Date(); //toBeDecorated.getCreatedAt(); TODO: Figure out how to use TimeStamp as a decorator.
	}
    
    /**
     * Set the time stamp variable of the image 
     * object to the current date-time
     */
    @Override
    public void process(Image imageToBeDecorated) {
    	// Water mark time stamp on image;
    }
    
//    /**
//     * Returns the description of a time stamped image.
//     */
//    @Override
//    public String getDescription() {
//    	
//        return super.getDescription() + ", including a time stamp.";
//    }
}