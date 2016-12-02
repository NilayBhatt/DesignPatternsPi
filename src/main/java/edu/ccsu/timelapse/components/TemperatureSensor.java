package edu.ccsu.timelapse.components;

import edu.ccsu.timelapse.adapters.CommandLineAdapter;

import java.io.BufferedReader;
import java.io.IOException;

public class TemperatureSensor extends CommandLineAdapter {

	@Override
	public String command() {
		
		return "python ./scripts/temperature.py";
	}

	public double getTemperature(){
		BufferedReader output = execute();
		double tempInCelsius = 0;
		try {
			tempInCelsius = Double.parseDouble(output.readLine());
		} catch (IOException e) {
			e.printStackTrace();
		}

		return  tempInCelsius;
	}
}
