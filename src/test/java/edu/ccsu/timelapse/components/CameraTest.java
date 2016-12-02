 package edu.ccsu.timelapse.components;

import static org.junit.Assert.*;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.junit.Test;

import edu.ccsu.timelapse.components.Camera;
import edu.ccsu.timelapse.exceptions.CannotTakePictureException;
import edu.ccsu.timelapse.exceptions.WrongOSException;

public class CameraTest {

	@Test
	public void testTakePicture() {
		boolean returnValue = false;
		if (!System.getProperty("os.name").equals("Linux")) {
			assertEquals(true, true);
		} 
		else {
			Camera cameraTest = new Camera();

			try {
				cameraTest.takePicture("testPic.jpg");

				Path currentRelativePath = Paths.get("");
				String s = currentRelativePath.toAbsolutePath().toString();
				s += "/testPic.jpg";
				
				File f = new File(s);
				if (f.exists() && !f.isDirectory()) {
					returnValue = true;
					assertEquals(true, returnValue);
					f.delete();
				} else {
					fail("Camera Did not take picture");
				}
			}
			catch (WrongOSException e) {
				fail("Failed the test");
				e.printStackTrace();
			}
		}
	}

}
