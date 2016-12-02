package edu.ccsu.timelapse.event;

import org.junit.Test;

import edu.ccsu.timelapse.events.TemperatureChange;
import edu.ccsu.timelapse.listeners.HueEditorListener;
import edu.ccsu.timelapse.listeners.contracts.TemperatureListener;

import static org.junit.Assert.*;

import java.util.ArrayList;


public class EventDispatcherTest {
	
	
	@Test
	public void itHasASubscriber() {
		
		EventDispatcher dispatcher = new EventDispatcher();
		
		TemperatureListener hueEditor = new HueEditorListener();
		
		dispatcher.subscribe(TemperatureChange.class, hueEditor);
		
		ArrayList<?> listeners = dispatcher.getListeners(TemperatureChange.class);
		
		assertEquals(listeners.size(), 1);
	}
	
	@Test
	public void itNotifiesSubscriber() {
		
		EventDispatcher dispatcher = new EventDispatcher();
		
		TempListener temp = new TempListener();
		
		dispatcher.subscribe(TemperatureChange.class, temp);
		
		assertFalse(temp.called);
		
		dispatcher.dispatch(new TemperatureChange(10));
		
		assertTrue(temp.called);
	}
	 
	
	public class TempListener implements TemperatureListener {
		
		public boolean called = false;
		
		public void temperatureChanged(double delta) {
			this.called = true;
		}

		
	}
}
