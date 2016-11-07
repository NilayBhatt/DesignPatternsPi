package ccsu.cs417.fall16.group4.main;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 
 * @author Edmir Alagic, Nilay Bhatt, Lukasz Brodowski, Deepankar Malhan,
 *         Sabahudin Mujcinovic
 */
public class Main {

	public static void main(String[] args) {
		Camera camera = new Camera();

		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Date date = new Date();
		try {
			camera.takePicture(dateFormat.format(date) +".jpg");
		} catch (CannotTakePictureException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
