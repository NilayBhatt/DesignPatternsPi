package edu.ccsu.timelapse.factories;

import edu.ccsu.timelapse.components.DateFormatted;
import edu.ccsu.timelapse.imagecollections.ConcreteImageComponent;
import edu.ccsu.timelapse.imagecollections.ImageComponent;
import edu.ccsu.timelapse.models.Image;

/**
 * Factory pattern used to create an individual Image object.
 */
public class ImageFactory implements ImageFactoryInterface {
	
	/**
	 * A method to create an image object based on properties
	 * that are collected at the time the image is snapped.
	 * 
	 * @param String path
	 * @param int temperature
	 * @param String timestamp
	 * @return an Image object with the following properties
	 */
	public ImageComponent make(String path, int temperature, String timestamp){
		
		ImageComponent imageComp = new ConcreteImageComponent();
		imageComp.getImage().setPath(path);
		imageComp.getImage().setTemperature(temperature);
		imageComp.getImage().setTimestamp(DateFormatted.fromString(timestamp));
		
		return imageComp;
		
	}
	
}
