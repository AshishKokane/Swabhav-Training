package com.aurionpro.test;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectInputStream.GetField;

import com.aurionpro.model.Singleton;

public class SingletonDeserilization {

	public static void main(String[] args) throws ClassNotFoundException, IOException {
		
		Singleton obj1 = Singleton.getInstance();
		Singleton obj2 = null;
		FileInputStream file = new FileInputStream("./lib/test.bin");

		ObjectInputStream in = new ObjectInputStream(file);

	

// Object readObject = in.readObject();
		  //
 Singleton readObject = (Singleton) in.readObject();
		
		if(obj1.hashCode() == readObject.hashCode())
			{System.out.println("same object");
			System.out.println("object: " + obj1.hashCode());
			System.out.println("deserilize obj : "+ readObject.hashCode());}
		
		else
			{System.out.println("object: " + obj1.hashCode());
		System.out.println("deserilize obj : "+ readObject.hashCode());}
		
		

		in.close();
		file.close();


	}

}
