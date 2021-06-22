package com.company.product1;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class Application1 {
	static final Logger logger = LoggerFactory.getLogger(Application1.class);
	public static void main (String args[]) {
		logger.debug("debug message");
		logger.info("info message");
		logger.error("error message");
		logger.warn("warn message");
	}
}
