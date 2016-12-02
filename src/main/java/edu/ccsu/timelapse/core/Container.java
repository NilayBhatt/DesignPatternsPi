package edu.ccsu.timelapse.core;

import java.util.Hashtable;

public class Container {
	
	private static Container instance = null;
	
	private Hashtable <String, Object> elements;

	private Container() {
		this.elements = new Hashtable<String, Object>();
	}
	
	public static Container getInstance() {
		
		if (Container.instance == null) {
			Container.instance = new Container();
		}
		
		return Container.instance;
	}
	
	public void bind(String key, Object value) {
		this.elements.put(key, value);
	}
	
	public Object get(String key) {
		return this.elements.get(key);
	}	
	
	
}
