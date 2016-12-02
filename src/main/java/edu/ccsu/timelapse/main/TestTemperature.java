package edu.ccsu.timelapse.main;

import java.io.BufferedReader;
import java.io.IOException;

import edu.ccsu.timelapse.components.TemperatureSensor;

public class TestTemperature {
	
	public static void main(String[] args) throws IOException {
		TemperatureSensor sensor = new TemperatureSensor();
		
		BufferedReader temperature = sensor.execute();
		
		System.out.println(temperature.readLine());
	}
}
