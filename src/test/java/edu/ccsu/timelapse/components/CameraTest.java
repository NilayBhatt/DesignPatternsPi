 package edu.ccsu.timelapse.components;

import static org.junit.Assert.*;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.junit.Test;

import edu.ccsu.timelapse.components.Camera;
import edu.ccsu.timelapse.exceptions.CannotTakePictureException;
import edu.ccsu.timelapse.exceptions.WrongOSException;
import edu.ccsu.timelapse.models.Image;

public class CameraTest {

	@Test
	public void testTakePicture() {
			
		boolean returnValue = false;
		
		if (!System.getProperty("os.name").equals("Linux")) {
			assertEquals(true, true);
			return;
		} 
	
		Camera cameraTest = new Camera();
		Image image = cameraTest.snap();
		
		File f = new File(Paths.get(image.getName()).toAbsolutePath().toString());
		
		if (f.exists() && !f.isDirectory()) {
			returnValue = true;
			assertEquals(true, returnValue);
			f.delete();
			return;
		} 
		
		fail("Camera Did not take picture");
	
	}

}
