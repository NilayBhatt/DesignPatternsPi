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
 */
public abstract class CommandLineAdapter {

	/**
	 * Executes a command line/terminal string that was passed in
	 * 
	 * @param str
	 * @throws IOException 
	 */
	protected final BufferedReader execute(String str) throws IOException {
		Runtime rt = Runtime.getRuntime();
			Process pr = rt.exec(str);
			BufferedReader input = new BufferedReader(new InputStreamReader(pr.getInputStream()));
			
			return input;
	}

}
