package edu.ccsu.timelapse.adapters;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * This abstract class helps adapt code from different languages to java.
 *
 */
public abstract class CommandLineAdapter {

	/**
	 * Executes the <code>str</code> terminal command and returns the InputStream for this command.
	 * 
	 * @param str The terminal command string
	 * @throws IOException Thrown when InputStream is not created successfully 
	 */
	protected final BufferedReader execute(String str) throws IOException {
		Runtime rt = Runtime.getRuntime();
			Process pr = rt.exec(str);
			BufferedReader input = new BufferedReader(new InputStreamReader(pr.getInputStream()));
			
			return input;
	}

}
