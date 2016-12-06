package edu.ccsu.timelapse.components;

import java.util.Objects;

import edu.ccsu.timelapse.builders.GIFMaker;

/**
 * A custom logger that will print out the various levels of logs in different colors.
 * 
 */
@SuppressWarnings("unused")
public class ConsoleUnixLogger implements Logger {
	
	/**
	 * Different color and command properties stored as String.
	 */
    private static final String ANSI_RESET = "\u001B[0m";
    
    /**
	 * Different color and command properties stored as String.
	 */
	private static final String ANSI_BLACK = "\u001B[30m";
    
    /**
	 * Different color and command properties stored as String.
	 */
    private static final String ANSI_RED = "\u001B[31m";
    
    /**
	 * Different color and command properties stored as String.
	 */
    private static final String ANSI_GREEN = "\u001B[32m";
    
    /**
	 * Different color and command properties stored as String.
	 */
    private static final String ANSI_YELLOW = "\u001B[33m";
    
    /**
	 * Different color and command properties stored as String.
	 */
    private static final String ANSI_BLUE = "\u001B[34m";
    
    /**
	 * Different color and command properties stored as String.
	 */
    private static final String ANSI_PURPLE = "\u001B[35m";
    
    /**
	 * Different color and command properties stored as String.
	 */
    private static final String ANSI_CYAN = "\u001B[36m";
    
    /**
	 * Different color and command properties stored as String.
	 */
    private static final String ANSI_WHITE = "\u001B[37m";

    /**
     * Log method for the custom logger.
     * 
     * @param String s to logged at info level.
     */
    public void info(String s) {
    System.out.println(ANSI_PURPLE +"$timelapse: "+ ANSI_RESET + ANSI_CYAN + s + ANSI_RESET);
    }

    /**
     * Log method for the custom logger.
     * 
     * @param String to logged at error level.
     */
    public void error(String s) {
        System.out.println(ANSI_PURPLE +"$timelapse: "+ ANSI_RESET +ANSI_RED + s + ANSI_RESET);
    }

    /**
     * Log method for the custom logger.
     * 
     * @param String to logged at warning level.
     */
    public void warning(String s) {
        System.out.println(ANSI_PURPLE +"$timelapse: "+ ANSI_RESET +ANSI_YELLOW + s + ANSI_RESET);
    }

    /**
     * Log method for the custom logger.
     * 
     * @param String to logged at normal level.
     */
    public void normal(String s) {
        System.out.println(ANSI_PURPLE +"$timelapse: "+ ANSI_RESET +s);
    }

    /**
     * Log method for the custom logger.
     * 
     * @param String to logged at success level.
     */
    public void success(String s) {
        System.out.println(ANSI_PURPLE + "$timelapse: " + ANSI_RESET + ANSI_GREEN + s + ANSI_RESET);
    }
    
    
    /**
     * String representation of the logger.
     * 
     * @return String
     */
    @Override
    public String toString() {
    	return "This is a custom unix logger for our application.";
    }
	
    /**
     * Hash code of this object
     * 
     * @return int hashCode
     */
	@Override
	public int hashCode() {
		return Objects.hashCode(this);
	}
	
	/**
	 * Checks if the two objects are equal
	 * 
	 * @return true if equal
	 */
	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof ConsoleUnixLogger) && (this.hashCode() != ((ConsoleUnixLogger)obj).hashCode())) {
			return false;
		}
		
		return true;
	}
    
}
