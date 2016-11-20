package edu.ccsu.timelapse.event;

public interface Event<E> {
	public void publish(E listener);
}