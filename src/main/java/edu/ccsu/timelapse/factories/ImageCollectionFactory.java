package edu.ccsu.timelapse.factories;

import java.io.IOException;

import edu.ccsu.timelapse.components.PiCamera;
import edu.ccsu.timelapse.exceptions.WrongOSException;
import edu.ccsu.timelapse.imagecollections.ImageComponent;
import edu.ccsu.timelapse.models.Image;
import edu.ccsu.timelapse.modifiers.ImageDecorator;
import edu.ccsu.timelapse.modifiers.ImageHueDecorator;

/**
 * Creates a new ImageCollectionFactory object that takes parameters that
 * specify in the type of collection you want and outputs the completed collection.
 * 
 */
public class ImageCollectionFactory {
	
	/**
	 * This static method construct can be used to create a custom collection that collects
	 * images for a certain amount of hours (elapsedTime) at an interval of a certain amount
	 * of seconds per image (captureInterval).
	 * 
	 * @param elapsedTime (how long would the user like the camera to capture images)(in hours)
	 * @param captureInterval (how often the camera takes a picture)(in seconds)
	 * @return an ImageCollection object with all of the images taken in the elapsed time and decorated
	 */
	public static ImageComponent make(int numPictures, int captureInterval) {
		
		//TODO: Fix this bug
		ImageComponent collection = null;
//		Image temp;
//		Camera cam = new Camera();
//		
//		int captureMilli = captureInterval * 1000;
//		
//		for(int i = 0; i < numPictures; i++){
//			try {
//				temp = cam.snap();
//				System.out.print(temp.getName());
//				System.out.println(i + ": snapped picture.");
//				collection.addComponent(temp);
//				Thread.sleep(captureMilli);
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}	
//		}
		
		return collection;
		
	}
}
