/**
 * Adapter class that calls a Python program (Raspistill) on a Raspberry Pi to take a picture
 * using the camera attached to it.
 * 
 * @author Deepankar Malhan, Edmir Alagic, Lukasz Brodowski, Nilay Bhatt, Sabahudin Mujcinovic
 */
package edu.ccsu.timelapse.components;

import java.io.IOException;
import java.util.Objects;

import edu.ccsu.timelapse.adapters.CommandLineAdapter;
import edu.ccsu.timelapse.exceptions.CannotTakePictureException;
import edu.ccsu.timelapse.exceptions.WrongOSException;
import edu.ccsu.timelapse.models.Image;

public class Camera extends CommandLineAdapter {

	private String pictureName;

	/**
	 * Returns the picture name.
	 * 
	 * @return picturename
	 */
	public String getPictureName() {
		
		return pictureName;
	}

	/**
	 * Set the picture name to the parameter plus the extension .jpeg
	 * 
	 * @param pictureName Name of the picture
	 */
	private void setPictureName(String pictureName) {
		this.pictureName = pictureName + ".jpg";
	}

	/**
	 * This method takes a picture using the camera attached to the Raspberry Pi.
	 * 
	 * @param picName The name for the picture that will be taken through the method
	 * @throws WrongOSException Exception thrown when OS is not Linux
	 * @throws CannotTakePictureException Exception thrown with picture not taken
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
	 * Creates the terminal command string that will execute Raspistill tool.
	 * 
	 * @return TerminalCommandString
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
	 * @return int Hashcode of the tool name and the picture name of this camera
	 */
	@Override
	public int hashCode() {
		
		return Objects.hash("raspistill", this.pictureName);
	}

	/**
	 * Checks if two camera objects are equal
	 * 
	 * @return boolean true when picture names for both <code>Camera</code> objects.
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
