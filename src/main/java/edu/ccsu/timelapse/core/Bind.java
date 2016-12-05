package edu.ccsu.timelapse.core;

/**
 * Interface method to be able to bind lambdas to the container.
 *
 * @param <E>
 */
interface Bind<E> {
	
	/**
	 * Container calls this to bind the instance object.
	 * 
	 * @return object of type E
	 */
	public E bind();
	
}
