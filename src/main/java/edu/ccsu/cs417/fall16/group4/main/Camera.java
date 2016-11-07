
package edu.ccsu.cs417.fall16.group4.main;

import java.io.IOException;
import java.util.Objects;

/**
 * Adapter class that calls a python program on raspberrypi to take a picture
 * using the camera attached to it.
 *
 */
public class Camera extends CommandLineAdapter {

	private String pictureName;

	/**
	 * gets the picture name
	 * 
	 * @return picture name
	 */
	public String getPictureName() {
		
		return pictureName;
	}

	/**
	 * sets the picture name.
	 * 
	 * @param pictureName
	 */
	private void setPictureName(String pictureName) {
		this.pictureName = pictureName + ".jpg";
	}

	/**
	 * This method takes a picture using the camera attached to the raspberrypi.
	 * 
	 * @param picName
	 * @throws WrongOSException 
	 * @throws CannotTakePictureException 
	 * @throws Exception 
	 */
	public Image takePicture(String picName) throws WrongOSException, CannotTakePictureException  {
		setPictureName(picName);
		
		if (! System.getProperty("os.name").equals("Linux")) {
			throw new WrongOSException("Not Linux sorry.");
		}
		
		String exec = buildCommand();
		try {
			execute(exec);
		} catch (IOException e) {
			throw new CannotTakePictureException("Something went wrong with the Camera!", e);
		}
		
		return new Image(this.pictureName);
	}

	/**
	 * Creates the string that will execute python code.
	 * 
	 * @return executable string
	 */
	private String buildCommand() {
		StringBuilder sb = new StringBuilder();
		sb.append("raspistill -vf -hf -o ");
		sb.append(pictureName);

		return sb.toString();
	}

	/**
	 * Returns the hash code of the pictureName.
	 * 
	 * @return int
	 */
	@Override
	public int hashCode() {
		
		return Objects.hash("raspistill", this.pictureName);
	}

	/**
	 * Checks if two camera objects are equal
	 * 
	 * @return boolean
	 */
	@Override
	public boolean equals(Object obj) {
		
		if (! (obj instanceof Camera)) {
			
			return false;
		}
		
		Camera a = (Camera) obj;
		
		if (! a.getPictureName().equals(this.getPictureName())) {
			
			return false;
		}
		
		return true;
	}

}
