package edu.ccsu.timelapse.modifiers;

import edu.ccsu.timelapse.imagecollections.ImageComponent;
import marvin.MarvinPluginCollection;
import marvin.image.MarvinImage;
import marvin.io.MarvinImageIO;

/**
 * This is a concrete implementation of ImageDecorator
 * abstract class which specializes in setting and adding
 * an image hue to an image object
 * 
 */
public class ImageHueDecorator extends ImageDecorator {
	
	/**
	 * Create a new instance of a ImageHueDecorator.
	 * 
	 * @param decorator
	 */
    public ImageHueDecorator(ImageComponent decorator) {
		super(decorator);
	}

    /**
     * Edits the physical file using the image stored in ImageComponent toBeDecorated and adds hue to it.
     */
    @Override
	public void processComponent() {
    	
		int temperature = toBeDecorated.getImage().getTemperature();
    	MarvinImage marvinImage = MarvinImageIO.loadImage(toBeDecorated.getImage().getPath());

		if(temperature >= 70) {
			MarvinPluginCollection.colorChannel(marvinImage,30, -100, -100);
		}

		if(temperature <=65) {
			MarvinPluginCollection.colorChannel(marvinImage, -100, -100, 30);
		}

		
		MarvinImageIO.saveImage(marvinImage, toBeDecorated.getImage().getPath());
	}

    /**
     * Checks if the object passed in is equal to this one.
     * 
     * @return true if both objects are equal
     * @param obj to compare to
     */
	@Override
	public boolean equals(Object decorator) {
		if(!(decorator instanceof ImageHueDecorator)) {
			return false;
		}
		
		ImageHueDecorator otherObj = (ImageHueDecorator) decorator;
		
		if(this.hashCode() != otherObj.hashCode()) {
			return false;
		}
		
		return true;
	}
}