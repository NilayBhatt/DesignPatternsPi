package edu.ccsu.timelapse.providers;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ServiceProviderTest {

	@Test
	public void it_is_a_app_service_provider() {
		assertEquals(new AppServiceProvider().toString(), "This is AppServiceProvider.");
	}
	
	@Test
	public void it_is_a_config_service_provider() {
		assertEquals(new ConfigServiceProvider().toString(), "This is ConfigServiceProvider.");
	}
	
	@Test
	public void it_is_a_event_service_provider() {
		assertEquals(new EventServiceProvider().toString(), "This is EventServiceProvider.");
	}
	
	@Test
	public void it_is_a_factory_service_provider() {
		assertEquals(new FactoryServiceProvider().toString(), "This is FactoryServiceProvider.");
	}
	
	@Test
	public void it_is_a_sensor_service_provider() {
		assertEquals(new SensorServiceProvider().toString(), "This is SensorsServiceProvider.");
	}

}
