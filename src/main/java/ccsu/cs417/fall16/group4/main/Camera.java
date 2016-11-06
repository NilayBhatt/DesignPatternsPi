
package ccsu.cs417.fall16.group4.main;

/**
 * Adapter class that calls a python program on raspberrypi to take a picture
 * using the camera attached to it.
 *
 */
public class Camera extends IAdapter {

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
	 */
	public void takePicture(String picName) {
		setPictureName(picName);
		if (System.getProperty("os.name").equals("Linux")) {
			String exec = buildTakePictureString();
			
			execute(exec);
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

}
