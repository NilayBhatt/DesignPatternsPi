package edu.ccsu.timelapse.providers;

import java.io.FileInputStream;
import java.util.Properties;

import static edu.ccsu.timelapse.core.Helper.bind;

/**
 * Config service provider.
 */
public class ConfigServiceProvider extends ServiceProvider {

	/**
	 * Register the configuration file and properties
	 */
	public void register() {
		
		bind("config", Properties.class, () -> {
			Properties props = new Properties();
			
			try {
				props.load(new FileInputStream("config/environment.properties"));
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			return props;
		});
		
	}
	
	/**
	 * String representation of this object.
	 * 
	 * @return String
	 */
	@Override
	public String toString() {
		return "This is ConfigServiceProvider.";
	}
	
}
