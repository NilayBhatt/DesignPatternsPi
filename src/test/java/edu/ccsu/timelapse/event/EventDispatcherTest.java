package edu.ccsu.timelapse.event;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.junit.Test;

import edu.ccsu.timelapse.events.AppBootstrapped;
import edu.ccsu.timelapse.listeners.NotifyItBootstrapped;
import edu.ccsu.timelapse.listeners.contracts.GenericListener;


public class EventDispatcherTest {
	
	@Test
	public void it_gets_the_same_dispatcher() {
		EventDispatcher disp = EventDispatcher.getInstance();
		EventDispatcher disp2 = EventDispatcher.getInstance();
		
		assertEquals(disp, disp2);
	}
	
	@Test
	public void itHasASubscriber() {
		
		EventDispatcher dispatcher = EventDispatcher.getInstance();

		dispatcher.subscribe(FakeEvent.class, new FakeListener());
		
		List<?> listeners = dispatcher.getListeners(FakeEvent.class);
		
		assertEquals(listeners.size(), 1);
	}
	
	@Test
	public void it_has_events() {
		EventDispatcher dispatcher = EventDispatcher.getInstance();

		dispatcher.subscribe(FakeEvent.class, new FakeListener());
		
		HashMap<Class, ArrayList> events = dispatcher.getEvents();
		
		assertEquals(events.size(), 1);
	}
	
	@Test
	public void itNotifiesSubscriber() {
		
		EventDispatcher dispatcher = EventDispatcher.getInstance();
		
		FakeListener temp = new FakeListener();
		
		dispatcher.subscribe(FakeEvent.class, temp);
		
		assertFalse(temp.called);
		
		dispatcher.dispatch(new FakeEvent());
		
		assertTrue(temp.called);
	}
	 
	
	public class FakeListener implements GenericListener {
		
		public boolean called = false;
		
		public void handle() {
			this.called = true;
		}
	}
	
	public class FakeEvent implements Event<GenericListener> {

		@Override
		public void publish(GenericListener listener) {
			listener.handle();
		}
		
	}
	
	
}
