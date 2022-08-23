package com.aurionpro.test;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import com.aurionpro.model.Employee;

public class SerializeTest {
	public static void main(String[] args) {

		try {
			Employee employee = new Employee(101, "abc", 60000);

			// create obj of fileOutputStream
			FileOutputStream file = new FileOutputStream("./lib/test.bin");
			ObjectOutputStream out = new ObjectOutputStream(file);

			// method for serializationS

			out.writeObject(employee);
			file.close();

			System.out.println("Employee object serialized");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
