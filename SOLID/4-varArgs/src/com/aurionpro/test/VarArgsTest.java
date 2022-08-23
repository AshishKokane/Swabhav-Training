package com.aurionpro.test;

import com.aurionpro.model.VarAgrs;

public class VarArgsTest {

	public static void main(String[] args) {


		VarAgrs varg = new VarAgrs();

        int sum2 = varg.sumNumber(2, 4);
        System.out.println("sum2 = " + sum2);

        int sum3 = varg.sumNumber(1, 3, 5);
        System.out.println("sum3 = " + sum3);

        
        System.out.println("---------------------------------");
        
         varg.sumNumber(true, "hello", "hello");
        
        System.out.println("---------------------------------");
        
        
        varg.doSomething(1, 1,2,3,4);
        
        System.out.println("---------------------------------");
        
        varg.doSomething(1,2,3,4,5);
        

	}

}
