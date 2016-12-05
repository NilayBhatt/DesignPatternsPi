package edu.ccsu.timelapse.components;

import edu.ccsu.timelapse.adapters.CommandLineAdapter;
import edu.ccsu.timelapse.components.contracts.Camera;
import edu.ccsu.timelapse.exceptions.WrongOSException;

/**
 * Camera that takes pictures.
 * 
 */
public class PiCamera extends CommandLineAdapter implements Camera {
	
	/**
	 * Cached string used for taking picture.
	 */
	private String fileName;

	@Override
	public String command() {

		return "python ./scripts/camera.py ./images/" + this.fileName;
	}

	/**
	 * This method takes a picture using the camera attached to the Raspberry Pi.
	 * 
	 * @returns path to image snapped.
	 */
	public String snap() {

		if (! System.getProperty("os.name").equals("Linux")) {
			try {
				throw new WrongOSException("Not Linux sorry.");
			} catch (WrongOSException e) {
				e.printStackTrace();
				System.err.println(e.getMessage());
			}
		}
		
		this.fileName();
		
		this.execute();
		
		return "./images/" + this.fileName;
	}
	
	/**
	 * Build unique path for file name for adaptor.
	 * 
	 * @return the name 
	 */
	private String fileName() {
		return this.fileName = new DateFormatted() + ".jpeg";
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
