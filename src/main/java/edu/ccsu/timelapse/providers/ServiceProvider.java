package edu.ccsu.timelapse.providers;

import edu.ccsu.timelapse.core.Container;

public abstract class ServiceProvider {
	
	

	public void register() { }
	
	protected Container app() {
		return Container.getInstance();
	}
	
}
