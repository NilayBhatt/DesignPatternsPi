package edu.ccsu.timelapse.modifiers;

import edu.ccsu.timelapse.imagecollections.ImageComponent;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

/**
 * This is a concrete implementation of ImageDecorator
 * abstract class which specializes adding a time stamp
 * to the image object passed through it
 * 
 */
public class ImageTimeDecorator extends ImageDecorator {
		
	/**
	 * Create a new instance of an ImageTimeDecorator.
	 * 
	 * @param image
	 */
    public ImageTimeDecorator(ImageComponent image) {
		super(image);
		
	}
    
    /**
     * Physically edit an image to add a timestamp to it using the Image stored in ImageComponent toBeDecorated.
     */
    @Override
    public void processComponent() {
		File file = new File(this.toBeDecorated.getImage().getPath());
		BufferedImage bi;
		try {
			bi = ImageIO.read(file);

			Graphics2D graphics = bi.createGraphics();
			Font font = new Font("ARIAL", Font.PLAIN, 20);
			graphics.setFont(font);
			graphics.drawString(this.toBeDecorated.getImage().getTimestamp().toString(), 50, 50);
			graphics.dispose();
		
			bi.flush();
			ImageIO.write(bi, "jpg", file);
		} catch (IOException e) {
			e.printStackTrace();
		}
    }
    
    /**
     * String representation of the object to be decorated.
     */
    @Override
	public String toString() {
		return this.toBeDecorated.toString();
	}
	
    /**
     * Checks if this object and the one passed in are equal or not.
     * 
     * @return true if both are equal
     */
	@Override
	public boolean equals(Object decorator) {
		if(!(decorator instanceof ImageTimeDecorator)) {
			return false;
		}
		
		ImageTimeDecorator otherObj = (ImageTimeDecorator) decorator;
		
		if(this.hashCode() != otherObj.hashCode()) {
			return false;
		}
		
		return true;
	}
}