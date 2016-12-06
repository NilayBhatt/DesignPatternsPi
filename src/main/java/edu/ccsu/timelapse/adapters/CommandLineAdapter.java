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
	 * Command to be executed.
	 *
	 * @return the command
	 */
	public String command() {
		return null;
	}

	/**
	 * Executes the <code>str</code> terminal command and returns the InputStream for this command.
	 *
	 * @throws IOException Thrown when InputStream is not created successfully
	 */
	public final BufferedReader execute() {
		Runtime rt = Runtime.getRuntime();
		Process pr = null;

		try {
			pr = rt.exec(this.command());
		} catch (IOException e) {
			e.printStackTrace();
			System.err.println("The command line adapter failed.");
		}

		return new BufferedReader(new InputStreamReader(pr.getInputStream()));

	}

	/**
	 * Reads and returns the first line of the bufferReader
	 * @param br
	 * @return
	 * @throws IOException
	 */
	public final String readFirstLine(BufferedReader br) throws IOException {
		String s = br.readLine();

		return s;
	}

	/**
	* String representation of this object
	*
	* @return String
	*/
	public String toString() {
		return "This is a CommandLineAdapter.";
	}
}
