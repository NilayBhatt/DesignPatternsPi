package edu.ccsu.cs417.fall16.group4.main;

/**
 * 
 * @author Edmir Alagic, Nilay Bhatt, Lukasz Brodowski, Deepankar Malhan,
 *         Sabahudin Mujcinovic
 */
public class Main {

	public static void main(String[] args) {
		Container container = new Container();
		
		try {
			container.run(10);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

}
