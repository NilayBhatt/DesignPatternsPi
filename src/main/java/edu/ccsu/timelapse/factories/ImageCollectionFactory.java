package edu.ccsu.timelapse.factories;

import static edu.ccsu.timelapse.core.Helper.app;
import static edu.ccsu.timelapse.core.Helper.event;

import edu.ccsu.timelapse.components.DateFormatted;
import edu.ccsu.timelapse.components.contracts.Camera;
import edu.ccsu.timelapse.components.contracts.Thermometer;
import edu.ccsu.timelapse.events.PictureTaken;
import edu.ccsu.timelapse.imagecollections.ConcreteImageComponent;
import edu.ccsu.timelapse.imagecollections.ImageComponent;
import edu.ccsu.timelapse.imagecollections.ImageComposite;

/**
 * Creates a new ImageCollectionFactory object that takes parameters that
 * specify in the type of collection you want and outputs the completed collection.
 * 
 */
public class ImageCollectionFactory implements ImageCollectionFactoryInterface {
	
	/**
	 * This static method construct can be used to create a custom collection that collects
	 * images for a certain amount of hours (elapsedTime) at an interval of a certain amount
	 * of seconds per image (captureInterval).
	 * 
	 * @param elapsedTime (how long would the user like the camera to capture images)(in hours)
	 * @param captureInterval (how often the camera takes a picture)(in seconds)
	 * @return an ImageCollection object with all of the images taken in the elapsed time and decorated
	 */
	public ImageComposite make(int numPictures, int captureInterval) {
		
		ImageComposite collection = new ImageComposite();
		ImageComponent temp = new ConcreteImageComponent();
		String path = null;
		
		Camera camera = app("camera");
		Thermometer thermometer = app("thermometer");
		ImageFactory factory = app("imageFactory");
		
		int captureMilli = captureInterval * 1000;
		
		for(int i = 0; i < numPictures; i++) {
			try {
				path = camera.snap();
				System.out.println(path + ": snapped picture. (" + i + ")");
				event(new PictureTaken());
				temp = factory.make(path, thermometer.temperature(), getTimeFromPath(path));
				collection.addComponent(temp);
				Thread.sleep(captureMilli);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}	
		}
		
		return collection;
	}

	/**
	 * Returns a formatted date.
	 * @param path
	 * @return DateFormatted
	 */
	public DateFormatted getTimeFromPath(String path){
		DateFormatted temp = DateFormatted.fromString(path);
		
		return temp;
	}
}
