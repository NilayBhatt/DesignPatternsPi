package edu.ccsu.timelapse.event;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Test;

import edu.ccsu.timelapse.events.AppBootstrapped;
import edu.ccsu.timelapse.listeners.SayHello;
import edu.ccsu.timelapse.listeners.contracts.GenericListener;


public class EventDispatcherTest {
	
	
	@Test
	public void itHasASubscriber() {
		
		EventDispatcher dispatcher = EventDispatcher.getInstance();

		dispatcher.subscribe(AppBootstrapped.class, new SayHello());
		
		List<?> listeners = dispatcher.getListeners(AppBootstrapped.class);
		
		assertEquals(listeners.size(), 1);
	}
	
	@Test
	public void itNotifiesSubscriber() {
		
		EventDispatcher dispatcher = EventDispatcher.getInstance();
		
		TempListener temp = new TempListener();
		
		dispatcher.subscribe(AppBootstrapped.class, temp);
		
		assertFalse(temp.called);
		
		dispatcher.dispatch(new AppBootstrapped());
		
		assertTrue(temp.called);
	}
	 
	
	public class TempListener implements GenericListener {
		
		public boolean called = false;
		
		public void handle() {
			this.called = true;
		}

		
	}
}
