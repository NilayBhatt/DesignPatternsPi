/**
 * Exception thrown for when error occurs while a picture is being taken.
 * 
 * @author Deepankar Malhan, Edmir Alagic, Lukasz Brodowski, Nilay Bhatt, Sabahudin Mujcinovic
 */
package edu.ccsu.timelapse.exceptions;

import java.io.IOException;

/**
 * Exception used for notifying environment of when a picture can not be taken.
 *
 */
public class CannotTakePictureException extends IOException {
	
	/**
	 * Create a new instance.
	 * 
	 * @param string
	 * @param e
	 */
	public CannotTakePictureException(String string, IOException e) {
		super(string, e);
	}

	/**
	 * Serial version unique identifier.
	 */
	private static final long serialVersionUID = 1L;

}
