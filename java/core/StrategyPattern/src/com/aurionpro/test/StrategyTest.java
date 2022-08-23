package com.aurionpro.test;

import com.aurionpro.model.AddOperation;
import com.aurionpro.model.DivisionOperation;
import com.aurionpro.model.MultiplyOperation;
import com.aurionpro.model.OperationStrategy;
import com.aurionpro.model.SubstractOperation;

public class StrategyTest {

	public static void main(String[] args) {

		OperationStrategy operation = new OperationStrategy(new SubstractOperation());

		int result = operation.doOperation(100, 20);
		System.out.println("Substract result :" + result);

		OperationStrategy addoperation = new OperationStrategy(new AddOperation());

		result = addoperation.doOperation(100, 20);
		System.out.println("Addition result :" + result);

		OperationStrategy muloperation = new OperationStrategy(new MultiplyOperation());

		result = muloperation.doOperation(100, 20);
		System.out.println("Multiplication result :" + result);

		OperationStrategy divoperation = new OperationStrategy(new DivisionOperation());

		result = divoperation.doOperation(100, 20);
		System.out.println("Division result :" + result);

	}

}
