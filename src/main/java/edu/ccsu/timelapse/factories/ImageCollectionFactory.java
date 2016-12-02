package edu.ccsu.timelapse.factories;

import java.io.IOException;

import edu.ccsu.timelapse.components.Camera;
import edu.ccsu.timelapse.exceptions.CannotTakePictureException;
import edu.ccsu.timelapse.exceptions.WrongOSException;
import edu.ccsu.timelapse.imagecollections.ImageCollection;
import edu.ccsu.timelapse.models.Image;
import edu.ccsu.timelapse.modifiers.ImageDecorator;
import edu.ccsu.timelapse.modifiers.ImageHueDecorator;

/**
 * Creates a new ImageCollectionFactory object that takes parameters that
 * specify in the type of collection you want and outputs the completed collection.
 * 
 * @author Edmir Alagic, Lukasz Brodowski, Nilay Bhatt, Sabahudin Mujcinovic, Deepankar Malhan
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
	public static ImageCollection make(double elapsedTime, int captureInterval) {
		
		ImageCollection collection = new ImageCollection();
		Image temp;
		Camera cam = new Camera();
		ImageDecorator hueDecorator;
		
		double elapsedMilli = ((elapsedTime / 60.0) / 60.0) * 1000;
		int captureMilli = captureInterval * 1000;
		
		while(elapsedMilli > 0.0) {
			
			try {
				
				temp = cam.takePicture(Double.toString(elapsedMilli));
				collection.addElements(temp);
				Thread.sleep(captureMilli);
				elapsedMilli = elapsedMilli - captureMilli;
				
			} catch (WrongOSException | CannotTakePictureException | InterruptedException e) {
				
				e.printStackTrace();
				
			}
			
		}
		
		/*
		 * 5 is just a filler for now, we will calculate
		 * an actual temperature-to-hue algorithm later.
		 */
		hueDecorator = new ImageHueDecorator(5);
		try {
			
			collection.decorate(hueDecorator);
			
		} catch (IOException e) {
			
			e.printStackTrace();
			
		}
		
		return collection;
	}
}
