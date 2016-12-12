package edu.ccsu.timelapse.components;

/**
 * Interface for a logger.
 *
 */
public interface Logger {

    /**
     * Log method for the custom logger.
     *
     * @param String to logged at error level.
     */
    void info(String s);

    /**
     * Log method for the custom logger.
     *
     * @param String to logged at error level.
     */
    void error(String s);

    /**
     * Log method for the custom logger.
     *
     * @param String to logged at error level.
     */
    void warning(String s);

    /**
     * Log method for the custom logger.
     *
     * @param String to logged at error level.
     */
    void normal(String s);

    /**
     * Log method for the custom logger.
     *
     * @param String to logged at error level.
     */
    void success(String s);

}
