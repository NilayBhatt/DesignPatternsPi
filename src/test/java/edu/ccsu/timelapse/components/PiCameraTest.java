 package edu.ccsu.timelapse.components;

import org.junit.Test;

import java.io.File;
import java.nio.file.Paths;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class PiCameraTest {

	@Test
	public void testTakePicture() {
			
		boolean returnValue = false;
		
		if (!System.getProperty("os.name").equals("Linux")) {
			assertEquals(true, true);
			return;
		} 
	
		PiCamera cameraTest = new PiCamera();
		String path = cameraTest.snap();
		
		File f = new File(Paths.get(path).toAbsolutePath().toString());
		
		if (f.exists() && !f.isDirectory()) {
			returnValue = true;
			assertEquals(true, returnValue);
			f.delete();
			return;
		} 
		
		fail("Camera Did not take picture");
	
	}

}
