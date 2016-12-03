package edu.ccsu.timelapse.components;

import java.text.SimpleDateFormat;
import java.util.Date;

import edu.ccsu.timelapse.adapters.CommandLineAdapter;
import edu.ccsu.timelapse.exceptions.WrongOSException;
import edu.ccsu.timelapse.models.Image;

/**
 * Camera that takes pictures.
 * 
 */
public class Camera extends CommandLineAdapter {
	
	/**
	 * Cached string used for taking picture.
	 */
	private String path;

	@Override
	public String command() {

		return "python ./scripts/camera.py ./images/" + this.path;
	}

	/**
	 * This method takes a picture using the camera attached to the Raspberry Pi.
	 * 
	 * @param picName The name for the picture that will be taken through the method
	 * @throws WrongOSException Exception thrown when OS is not Linux
	 */
	public Image snap() {

		if (! System.getProperty("os.name").equals("Linux")) {
			try {
				throw new WrongOSException("Not Linux sorry.");
			} catch (WrongOSException e) {
				e.printStackTrace();
				System.err.println(e.getMessage());
			}
		}
		
		this.buildPath();
		
		this.execute();
		
		return new Image(this.path);
	}
	
	private String buildPath() {
		return this.path = new SimpleDateFormat("M-d-y-k-m-s-S").format(new Date()) + ".jpeg";
	}
	
	/**
	 * String representation of Camera.
	 * 
	 * @return
	 */
	@Override
	public String toString() {
		return "A camera component.";
	}

}
