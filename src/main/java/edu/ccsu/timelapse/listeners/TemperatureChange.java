package edu.ccsu.timelapse.listeners;

import edu.ccsu.timelapse.event.Event;
import edu.ccsu.timelapse.listeners.contracts.TemperatureListener;

public class TemperatureChange implements Event<TemperatureListener> {
	
	private double delta;
	
	public TemperatureChange(double delta) {
		this.delta = delta;
	}
	
	@Override
	public void publish(TemperatureListener listener) {
		if (this.delta > 0) {
			listener.temperatureIncreased(this.delta);
		} else {
			listener.temperatureDecreased(this.delta);
		}
		
		
	}

}
