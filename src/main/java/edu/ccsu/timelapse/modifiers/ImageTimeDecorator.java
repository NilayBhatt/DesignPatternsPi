package edu.ccsu.timelapse.modifiers;

import edu.ccsu.timelapse.models.Image;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Date;

/**
 * This is a concrete implementation of ImageDecorator
 * abstract class which specializes adding a time stamp
 * to the image object passed through it
 */
public class ImageTimeDecorator implements ImageDecorator {
	
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
    public void process(Image imageToBeDecorated) throws IOException {
		File file = new File(imageToBeDecorated.getName());
		BufferedImage bi = ImageIO.read(file);

		Graphics2D graphics = bi.createGraphics();
		Font font = new Font("ARIAL", Font.PLAIN, 20);
		graphics.setFont(font);
		graphics.drawString(imageToBeDecorated.getCreatedAt().toString(), 50, 50);

        bi.flush();
		ImageIO.write(bi, "jpg", file);
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