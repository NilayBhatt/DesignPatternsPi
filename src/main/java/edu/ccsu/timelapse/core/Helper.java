package edu.ccsu.timelapse.core;

public final class Helper {
	
	public static Object app(String key) {
		
		return Container.getInstance().get(key);
	}
	
	public static void bind(String key, Object value) {
		
		Container.getInstance().bind(key, value);
	}
	
}
