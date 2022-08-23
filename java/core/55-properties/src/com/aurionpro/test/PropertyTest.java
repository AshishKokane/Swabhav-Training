package com.aurionpro.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertyTest {

	public static void main(String[] args) {
		try {
			FileInputStream inFile = new FileInputStream("./resources/config.properties");
			Properties properties = new Properties();
			properties.load(inFile);

			String username = properties.getProperty("username");
			String password = properties.getProperty("password");
			System.out.println(username);
			System.out.println(password);

			System.out.println(properties.getProperty("username2")); // if key not present

			System.out.println(properties.getProperty("username3", "admin"));// default key value

		} catch (FileNotFoundException e) {
			System.out.println("FileNotFoundException");

		} catch (IOException e) {
			System.out.println("IOException");
		}
	}

}
