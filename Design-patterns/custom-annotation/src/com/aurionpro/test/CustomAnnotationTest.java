package com.aurionpro.test;

import java.lang.reflect.Method;

import com.aurionpro.model.CustomAnnotation;
import com.aurionpro.model.important;

public class CustomAnnotationTest {

	public static void main(String[] args) {
	
		CustomAnnotation custom = new  CustomAnnotation();
		
//		if(custom.getClass().isAnnotationPresent(important.class))
//			System.out.println("class has important annotation");
//		
//		else
//			System.out.println("no annotation to class ");
		
		
		for (Method method: custom.getClass().getDeclaredMethods()) {
			
			if(method.isAnnotationPresent(important.class))
				System.out.println(method.getName());
	
			
		}
		

	}

}
