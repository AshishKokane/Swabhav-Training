package com.aurionpro.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

import com.aurionpro.model.Employee;

public class DeserializeTest {
	public static void main(String[] args) {
		Employee[] employee = null;

		try {
			FileInputStream file = new FileInputStream("./lib/test.bin");

			ObjectInputStream in = new ObjectInputStream(file);

			System.out.println("Deserialize data: " + in);

			employee = (Employee[]) in.readObject();

			System.out.println(employee);

			in.close();
			file.close();
			for (Employee emp : employee) {
				System.out.println(emp);

			}

			System.out.println("Employee object Deserializeds");

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
