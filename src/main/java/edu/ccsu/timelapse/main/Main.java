package edu.ccsu.timelapse.main;

import edu.ccsu.timelapse.event.EventDispatcher;

/**
 * Runs the application to take a picture 10 times before ending.
 * 
 * @author Edmir Alagic, Nilay Bhatt, Lukasz Brodowski, Deepankar Malhan,
 *         Sabahudin Mujcinovic
 */
public class Main {

	public static void main(String[] args) {
		
		Container container = new Container(new Camera(), new EventDispatcher());
		
		try {
			container.run(10);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

}