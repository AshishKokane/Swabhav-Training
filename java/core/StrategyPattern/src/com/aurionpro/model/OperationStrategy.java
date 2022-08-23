package com.aurionpro.model;

public class OperationStrategy {

	private IOperation operation;

	public OperationStrategy(IOperation operation) {
		super();
		this.operation = operation;

	}

	public int doOperation(int a, int b) {

		return this.operation.doOperation(a, b);

	}

}
