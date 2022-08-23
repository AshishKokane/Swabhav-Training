package com.aurionpro.test;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;

import com.aurionpro.model.Employee;

public class SerializeTest {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		try {

			System.out.println("Enter No of Employee Objects:-");
			int no = sc.nextInt();

			Employee[] employees = new Employee[no];

			for (int i = 0; i < employees.length; i++) {

				System.out.println("Enter Emp Id:");
				int id = sc.nextInt();

				System.out.println("Enter Emp Name:");
				String name = sc.next();

				System.out.println("Enter Emp salary:");
				double salary = sc.nextDouble();

				employees[i] = new Employee(id, name, salary);

			}

			FileOutputStream file = new FileOutputStream("./lib/test.bin");
			ObjectOutputStream out = new ObjectOutputStream(file);

			// method for serializationS

			out.writeObject(employees);

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
