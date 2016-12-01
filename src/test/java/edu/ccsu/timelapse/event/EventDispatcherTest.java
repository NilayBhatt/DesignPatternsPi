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
		
		assertFalse(temp.increased_called);
		assertFalse(temp.decrease_called);
		
		dispatcher.dispatch(new TemperatureChange(10));
		
		assertTrue(temp.increased_called);
		assertFalse(temp.decrease_called);
		
		dispatcher.dispatch(new TemperatureChange(-5));
		
		assertTrue(temp.decrease_called);
		
	}
	 
	
	public class TempListener implements TemperatureListener {
		
		public boolean increased_called = false;
		public boolean decrease_called = false;
		
		public void temperatureIncreased(double delta) {
			this.increased_called = true;
		}

		public void temperatureDecreased(double delta) {
			this.decrease_called = true;
			
		}
		
	}
}
