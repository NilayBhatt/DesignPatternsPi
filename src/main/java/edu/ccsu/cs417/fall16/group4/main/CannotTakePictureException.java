/**
 * Exception thrown for when error occurs while a picture is being taken.
 * 
 * @author Deepankar Malhan, Edmir Alagic, Lukasz Brodowski, Nilay Bhatt, Sabahudin Mujcinovic
 */
package edu.ccsu.cs417.fall16.group4.main;

import java.io.IOException;

public class CannotTakePictureException extends IOException {

	public CannotTakePictureException(String string, IOException e) {
		super(string, e);
	}

	private static final long serialVersionUID = 1L;

}
