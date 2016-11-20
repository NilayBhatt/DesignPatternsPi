package edu.ccsu.cs417.fall16.group4.main;

import static org.junit.Assert.*;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

import org.junit.Test;

public class CommandLineAdapterTest {

	@Test
	public void testBufferedReader() {
		TestAdapter adapter = new TestAdapter();
		try {
			BufferedReader buff = adapter.execute("echo hello");
			assertTrue(buff.readLine().equals("hello"));
		} catch (IOException e) {
			fail("Error reading buffer.");
		}
	}
	
	public class TestAdapter extends CommandLineAdapter {
		
	}

}