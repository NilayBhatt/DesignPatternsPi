
package ccsu.cs417.fall16.group4.main;

import java.io.IOException;

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
		this.pictureName = pictureName;
	}

	/**
	 * This method takes a picture using the camera attached to the raspberrypi.
	 * 
	 * @param picName
	 * @throws CannotTakePictureException
	 */
	public void takePicture(String picName) throws CannotTakePictureException {
		setPictureName(picName);
		if (System.getProperty("os.name").equals("Linux")) {
			String exec = buildTakePictureString();

			try {
				execute(exec);
			} catch (IOException e) {
				throw new CannotTakePictureException("Something went wrong with the Camera!", e);
			}
		} else {
			System.out.println("Cannot take picure, OS not compatible!");
		}
	}

	/**
	 * Creates the string that will execute python code.
	 * 
	 * @return executable string
	 */
	private String buildTakePictureString() {
		StringBuilder sb = new StringBuilder();
		sb.append("raspistill -o ");
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
		final int prime = 31;
		int result = 1;
		result = prime * result + ((pictureName == null) ? 0 : pictureName.hashCode());
		return result;
	}

	/**
	 * Checks if two camera objects are equal
	 * 
	 * @return boolean
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Camera other = (Camera) obj;
		if (pictureName == null) {
			if (other.pictureName != null)
				return false;
		} else if (!pictureName.equals(other.pictureName))
			return false;
		return true;
	}

}
