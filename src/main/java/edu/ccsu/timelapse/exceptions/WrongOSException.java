/**
 * Exception class thrown when OS that the application is running on is not Linux.
 * 
 * @author Deepankar Malhan, Edmir Alagic, Lukasz Brodowski, Nilay Bhatt, Sabahudin Mujcinovic
 */
package edu.ccsu.timelapse.exceptions;

import java.io.IOException;

/**
 * Exception use when you run the program on the wrong kernel.
 *
 */
public class WrongOSException extends IOException {

	/**
	 * Create a new instance of an exception.
	 * 
	 * @param string
	 */
	public WrongOSException(String string) {
		super(string);
	}

	/**
	 * The serial version unique identifier. 
	 */
	private static final long serialVersionUID = 1L;

}
