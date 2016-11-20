package edu.ccsu.cs417.fall16.group4.event;

public interface Event<E> {
	public void publish(E listener);
}