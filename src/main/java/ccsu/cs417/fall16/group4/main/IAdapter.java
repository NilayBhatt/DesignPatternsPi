/**
 * 
 */
package ccsu.cs417.fall16.group4.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * This abstract class helps adapt code from different languages to java.
 * 
 * @author Nilay Bhatt
 *
 */
public abstract class IAdapter {

	/**
	 * Executes a command line/terminal string that was passed in
	 * @param str
	 */
	protected void execute(String str) {
		Runtime rt = Runtime.getRuntime();
		try {
			Process pr = rt.exec(str);
			BufferedReader input = new BufferedReader(new InputStreamReader(pr.getInputStream()));
			String line;
			try {
				while ((line = input.readLine()) != null)
					System.out.println(line);
			} catch (IOException e) {
				e.printStackTrace();
			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
