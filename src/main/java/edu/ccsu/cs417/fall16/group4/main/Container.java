package edu.ccsu.cs417.fall16.group4.main;

import java.util.ArrayList;
import java.util.Date;
import java.util.Objects;

public class Container {
	
	private ArrayList<Image> images;
	
	private Camera camera;
	
	public Container() {
		this.camera = new Camera();
	}
	
	public void run(int times) throws InterruptedException {
		for (int i = 0; i < times; i++) {
			this.takePicture();
			Thread.sleep(1000);
		}
	}
	
	private void takePicture() {
		Date date = new Date();
		
		try {
			Image picture = this.camera.takePicture(date.toString());
			images.add(picture);
		} catch (CannotTakePictureException e) {
			e.printStackTrace();
		} catch (WrongOSException e) {
			System.out.println(e.getMessage());
		}
	}
	
	public ArrayList<Image> getImages() {
		
		return this.images;
	}
	
	@Override
	public String toString() {
		String output = "";
		for (Image image : images) {
			output += image.getName() + " ";
		}
		
		return output;
	}
	
	@Override
	public int hashCode() {
		
		return Objects.hash(this.images);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (! (obj instanceof Container)) {
			
			return false;
		}
		
		Container a = (Container) obj;
		
		for (Image image : this.images) {
			if (! a.getImages().contains(image)) {
				return false;
			}
		}
		
		return true;
	}


}
