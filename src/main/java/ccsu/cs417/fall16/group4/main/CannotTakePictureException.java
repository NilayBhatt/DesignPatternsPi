package ccsu.cs417.fall16.group4.main;

import java.io.IOException;

public class CannotTakePictureException extends IOException {

	public CannotTakePictureException(String string, IOException e) {
		super(string, e);
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

}
