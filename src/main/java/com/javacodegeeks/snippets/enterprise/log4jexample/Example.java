package com.javacodegeeks.snippets.enterprise.log4jexample;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.apache.log4j.Logger;

public class Example {

	static Logger log = Logger.getLogger(Example.class.getName());

	public static void main(String[] args) throws IOException{
		
		
		log.debug("Numberd is smaller than 100, so it is correct!");
		log.info("Numberd is smaller than 100, so it is correct!");
		log.error("Numbedr is smaller than 100, so it is correct!");
	}
}
