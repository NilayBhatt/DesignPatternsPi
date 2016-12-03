package edu.ccsu.timelapse.components;

/**
 */
public class ConsoleUnixLogger implements Logger {
    private static final String ANSI_RESET = "\u001B[0m";
    private static final String ANSI_BLACK = "\u001B[30m";
    private static final String ANSI_RED = "\u001B[31m";
    private static final String ANSI_GREEN = "\u001B[32m";
    private static final String ANSI_YELLOW = "\u001B[33m";
    private static final String ANSI_BLUE = "\u001B[34m";
    private static final String ANSI_PURPLE = "\u001B[35m";
    private static final String ANSI_CYAN = "\u001B[36m";
    private static final String ANSI_WHITE = "\u001B[37m";

    public void info(String s) {
    System.out.println(ANSI_PURPLE +"$timelapse: "+ ANSI_RESET + ANSI_CYAN + s + ANSI_RESET);
    }

    public void error(String s) {
        System.out.println(ANSI_PURPLE +"$timelapse: "+ ANSI_RESET +ANSI_RED + s + ANSI_RESET);
    }

    public void warning(String s) {
        System.out.println(ANSI_PURPLE +"$timelapse: "+ ANSI_RESET +ANSI_YELLOW + s + ANSI_RESET);
    }

    public void normal(String s) {
        System.out.println(ANSI_PURPLE +"$timelapse: "+ ANSI_RESET +s);
    }

    public void success(String s) {
        System.out.println(ANSI_PURPLE + "$timelapse: " + ANSI_RESET + ANSI_GREEN + s + ANSI_RESET);
    }

}
