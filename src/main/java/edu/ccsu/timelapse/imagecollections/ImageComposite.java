/**
 *	Defines an interface to be used by Image and ImageCollection 
 *	(which is a composite of ImageComposite and all its concrete classes)
 *
 * @author Deepankar Malhan, Lukasz Brodowski, Edmir Alagic, Nilay Bhatt, Sabahudin Mujcinovic
 */
package edu.ccsu.timelapse.imagecollections;

import edu.ccsu.timelapse.modifiers.ImageDecorator;

import java.io.IOException;

public interface ImageComposite {
	public void decorate(ImageDecorator decorator) throws IOException;
}