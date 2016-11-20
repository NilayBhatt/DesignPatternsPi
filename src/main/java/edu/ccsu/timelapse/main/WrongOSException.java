/**
 * Exception class thrown when OS that the application is running on is not Linux.
 * 
 * @author Deepankar Malhan, Edmir Alagic, Lukasz Brodowski, Nilay Bhatt, Sabahudin Mujcinovic
 */
package edu.ccsu.timelapse.main;

import java.io.IOException;

public class WrongOSException extends IOException {

	public WrongOSException(String string) {
		super(string);
	}

	private static final long serialVersionUID = 1L;

}
