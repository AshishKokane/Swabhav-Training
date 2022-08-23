package com.aurionpro.test;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import com.aurionpro.model.Singleton;

public class SingletonTest {

	public static void main(String[] args) throws IOException {
		
		Singleton obj1 = Singleton.getInstance();
		System.out.println(obj1.hashCode());
    	Singleton obj2 = Singleton.getInstance();
		System.out.println(obj2.hashCode());
		
		
		
		
		
		
		
		FileOutputStream file = new FileOutputStream("./lib/test.bin");
		ObjectOutputStream out = new ObjectOutputStream(file);

		// method for serializationS

		out.writeObject(Singleton.getInstance());
		file.close();
		System.out.println("object serialized");
		
		
		
//		Runnable myThread1 = () ->
//        {
//        	Singleton obj = Singleton.getInstance();
//    		System.out.println(obj.hashCode());
//      
//        };
//        
//        myThread1.run();
//        
//    	Runnable myThread2 = () ->
//        {
//        	Singleton obj1 = Singleton.getInstance();
//    		System.out.println(obj1.hashCode());
//      
//        };
//        
//        myThread2.run();
        
        
        
        

	}

}
