package edu.ccsu.timelapse.adapters;

import static org.junit.Assert.*;

import java.io.BufferedReader;
import java.io.IOException;

import org.junit.Test;

import edu.ccsu.timelapse.adapters.CommandLineAdapter;

public class CommandLineAdapterTest {

	@Test
	public void testBufferedReader() {
		TestAdapter adapter = new TestAdapter();
		try {
			BufferedReader buff = adapter.execute();
			assertTrue(buff.readLine().equals("hello"));
		} catch (IOException e) {
			fail("Error reading buffer.");
		}
	}
	
	public class TestAdapter extends CommandLineAdapter {
		@Override
		public String command() {
			return "echo hello";
		}
	}

}