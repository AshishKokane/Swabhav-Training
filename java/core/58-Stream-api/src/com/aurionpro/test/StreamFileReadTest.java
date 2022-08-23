package com.aurionpro.test;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamFileReadTest {

	public static void main(String[] args) {

		FileReader fr = null;
		try {
			fr = new FileReader("./resource/names.txt");

			int ch;
			// read from FileReader till the end of file
			while ((ch = fr.read()) != -1)
				System.out.print((char) ch);

			System.out.println();
			System.out.println("-------------------using stream--------------");

			String fileName = "./resource/names.txt";
			Stream<String> stream = Files.lines(Paths.get(fileName));

			List<String> list = stream.filter(line -> !line.startsWith("abc")).map(String::toUpperCase)
					.collect(Collectors.toList());
			list.forEach(System.out::println);

			fr.close();

		} catch (FileNotFoundException fe) {
			System.out.println("File not found");
		} catch (IOException e) {

		}

	}

}
