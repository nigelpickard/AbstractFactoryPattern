/**
 * 
 */
package com.npickard;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

/**
 * @author nigel
 * 
 */
public class MyApp {

	// Define a static logger variable so that it references the
	// Logger instance named "MyApp".
	static Logger logger = Logger.getLogger(MyApp.class);

	public static void main(String[] args) {

		// Set up a simple configuration that logs on the console.
		BasicConfigurator.configure();

		logger.info("Abstract Factory Pattern Implementation.");
	}
}