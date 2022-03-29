package com.qa.calc;

public class Calculator {

	public double addition(double a, double b) {
		return a + b;
	}

	public double subtraction(double a, double b) {
		return a - b;

	}

	public double div(double a, double b) throws ArithmeticException {

		if (b == 0) {
			throw new ArithmeticException("Can't divide by 0!");
		} else {

			return a / b;
		}
	}

	public double mult(double a, double b) {
		return a * b;

	}

}
