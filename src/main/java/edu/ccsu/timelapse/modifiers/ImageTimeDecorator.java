//package edu.ccsu.timelapse.modifiers;
//
//import java.awt.Font;
//import java.awt.Graphics2D;
//import java.awt.image.BufferedImage;
//import java.io.File;
//import java.io.IOException;
//import java.util.Date;
//
//import javax.imageio.ImageIO;
//
//import edu.ccsu.timelapse.components.DateFormatted;
//import edu.ccsu.timelapse.imagecollections.ImageComponent;
//import edu.ccsu.timelapse.models.Image;
//
///**
// * This is a concrete implementation of ImageDecorator
// * abstract class which specializes adding a time stamp
// * to the image object passed through it
// */
//public class ImageTimeDecorator implements ImageDecorator {
//	
//	private String timestamp;
//	
//	private ImageComponent image;
//	
//	/**
//	 * Create a new instance of an ImageTimeDecorator.
//	 * 
//	 * @param toBeDecorated
//	 */
//    public ImageTimeDecorator(ImageComponent image) {
//		super();
//		
//		this.image = image;
//		this.timestamp = DateFormatted.getInstance().formatDate(new Date());
//	}
//    
//    /**
//     * Set the time stamp variable of the image 
//     * object to the current date-time
//     */
//    public void process() throws IOException {
//		File file = new File(this.image.getName());
//		BufferedImage bi = ImageIO.read(file);
//
//		Graphics2D graphics = bi.createGraphics();
//		Font font = new Font("ARIAL", Font.PLAIN, 20);
//		graphics.setFont(font);
//		graphics.drawString(this.image.getCreatedAt(), 50, 50);
//		graphics.dispose();
//		
//        bi.flush();
//		ImageIO.write(bi, "jpg", file);
//    }
//}