package edu.ccsu.timelapse.core;

import java.util.Hashtable;

@SuppressWarnings("unchecked")
public class Container {
	
	private static Container instance = null;
	
	private Hashtable <Class<?>, Object> elements;
	
	private Hashtable<String, Class<?>> keys;

	private Container() {
		this.elements = new Hashtable<Class<?>, Object>();
		this.keys = new Hashtable<String, Class<?>>();
	}
	
	public static Container getInstance() {
		if (Container.instance == null) {
			Container.instance = new Container();
		}
		
		return Container.instance;
	}
	
	public void bind(String normal, Class<?> key, Object value) {
		this.keys.put(normal, key);
		this.elements.put(key, value);
	}
	
	public void bind(Class<?> key, Object value) {
		this.elements.put(key, value);
	}
	
	public void bind(String normal, Class<?> key, Bind<?> closure) {
		this.keys.put(normal, key);
		this.elements.put(key, closure.bind());	
	}
	
	public void bind(Class<?> key, Bind<?> closure) {
		this.keys.put(key.getName().toLowerCase(), key);
		this.elements.put(key, closure.bind());
	}
	
	
	public <E> E get(Class<E> key) {
		
		return (E) this.elements.get(key);
	}	
	
	public <E> E get(String key) {
		E contract = (E) this.keys.get(key);
		
		return (E) this.elements.get(contract);
	}
	
	
}
