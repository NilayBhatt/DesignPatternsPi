package edu.ccsu.timelapse.core;

import static org.junit.Assert.*;

import org.junit.Test;

public class ContainerTest {

	@Test
	public void it_gets_the_same_container() {
		
		Container app = Container.getInstance();
		Container app2 = Container.getInstance();
		
		assertEquals(app, app2);
	}
	
	@Test
	public void it_binds_to_the_container() {
		Container app = Container.getInstance();
		
		Faked faked = new Faked();
		
		app.bind("fake", Fake.class, faked);
		
		assertEquals(app.get(Fake.class), faked);
		assertEquals(app.get("fake"), faked);
	}
	
	@Test
	public void it_binds_to_the_container_and_creates_string_index() {
		Container app = Container.getInstance();
		
		Faked faked = new Faked();
		
		app.bind(Fake.class, faked);
		
		assertEquals(app.get("edu.ccsu.timelapse.core.containertest$fake"), faked);
	}
	
	@Test
	public void it_binds_using_a_lambda() {
		Container app = Container.getInstance();
		
		Faked faked = new Faked();
		
		app.bind("fake", Fake.class, () -> {
			
			return faked;
		});
		
		assertEquals(app.get(Fake.class), faked);
		assertEquals(app.get("fake"), faked);
	}
	
	@Test
	public void it_binds_using_a_lambda_and_creates_string_index() {
		Container app = Container.getInstance();
		
		Faked faked = new Faked();
		
		app.bind(Fake.class, () -> {
			
			return faked;
		});
		
		assertEquals(app.get(Fake.class), faked);
		assertEquals(app.get("edu.ccsu.timelapse.core.containertest$fake"), faked);
	}
	
	
	interface Fake {}
	
	class Faked implements Fake {}

}
