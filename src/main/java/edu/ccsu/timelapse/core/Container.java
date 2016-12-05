package edu.ccsu.timelapse.core;

import java.util.Hashtable;

/**
 * An inversion of control container allowing object instances to be bound to interfaces.
 *
 */
public class Container {
	
	/**
	 * The singleton instance of the container.
	 */
	private static Container instance = null;
	
	/**
	 * The interface to object hash table.
	 */
	private Hashtable <Class<?>, Object> elements;
	
	/**
	 * The string key to interface hash table.
	 */
	private Hashtable<String, Class<?>> keys;

	/**
	 * Create a new instance of a container.
	 */
	private Container() {
		this.elements = new Hashtable<Class<?>, Object>();
		this.keys = new Hashtable<String, Class<?>>();
	}
	
	/**
	 * Get the singleton instance of a container.
	 * 
	 * @return the instance of the container
	 */
	public static Container getInstance() {
		if (Container.instance == null) {
			Container.instance = new Container();
		}
		
		return Container.instance;
	}
	
	/**
	 * Bind a string and interface to a concrete object.
	 * 
	 * @param normal
	 * @param key
	 * @param value
	 */
	public void bind(String normal, Class<?> key, Object value) {
		this.keys.put(normal, key);
		this.elements.put(key, value);
	}
	
	/**
	 * Bind a interface to an object.
	 * 
	 * @param key
	 * @param value
	 */
	public void bind(Class<?> key, Object value) {
		this.keys.put(key.getName().toLowerCase(), key);
		this.elements.put(key, value);
	}
	
	/**
	 * Binds an key and interface to a lambda which returns a new instance of an object.
	 * 
	 * @param normal
	 * @param key
	 * @param closure
	 */
	public void bind(String normal, Class<?> key, Bind<?> closure) {
		this.keys.put(normal, key);
		this.elements.put(key, closure.bind());	
	}
	
	/**
	 * Bind a interface to a lambda which returns a new instance of an object.
	 * 
	 * @param key
	 * @param closure
	 */
	public void bind(Class<?> key, Bind<?> closure) {
		this.keys.put(key.getName().toLowerCase(), key);
		this.elements.put(key, closure.bind());
	}
	
	/**
	 * Get the object instance that the interface is binded to.
	 * 
	 * @param key
	 * @return an instance of the concrete object
	 */
	@SuppressWarnings("unchecked")
	public <E> E get(Class<E> key) {
		
		return (E) this.elements.get(key);
	}	
	
	/**
	 * Get the object instance that the string key is binded to.
	 * 
	 * @param key
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public <E> E get(String key) {
		E contract = (E) this.keys.get(key);
		
		return (E) this.elements.get(contract);
	}
	
	
}
