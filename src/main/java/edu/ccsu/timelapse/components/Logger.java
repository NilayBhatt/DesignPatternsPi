package edu.ccsu.timelapse.components;

/**
 * Interface for a logger.
 *
 */
public interface Logger {

    void info(String s);

    void error(String s);

    void warning(String s);

    void normal(String s);

    void success(String s);

}
