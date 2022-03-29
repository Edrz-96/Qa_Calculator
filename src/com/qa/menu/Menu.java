package com.qa.menu;

import com.qa.calc.Calculator;
import com.qa.utility.UtilityScanner;

public class Menu {
	
	
		public void run() {
		Calculator calc = new Calculator();
		String action = getAction();
		Actions(action, calc);
	}

	public String getAction() {
		String menuMsg = "==================================================\n" + "Calculator System:\n"
				+ "==================================================\n" + "\t- Add - add two parameters together"
				+ "\n" + "\t- Subtract - subtract an input from the second" + "\n"
				+ "\t- Multiply - multiply parameters together" + "\n" + "\t- Divide - divide a parameter by the other"
				+ "\n" + "\t=====\n" + "\t- Exit - Exit Application\n"
				+ "==================================================\n";
		System.out.println(menuMsg + "What calculation do you want to perform?");

		return UtilityScanner.returnString();

	}

	public void Actions(String action, Calculator calc) {
		switch (action) {
		case "add":
			System.out.println(
					"Your answer is: " + calc.addition(UtilityScanner.returnInt(), UtilityScanner.returnInt()));
			break;
		case "subtract":
			System.out.println(
					"Your answer is: " + calc.subtraction(UtilityScanner.returnInt(), UtilityScanner.returnInt()));
			break;
		case "divide":
			try {
				System.out
						.println("Your answer is: " + calc.div(UtilityScanner.returnInt(), UtilityScanner.returnInt()));
			} catch (ArithmeticException e) {
				e.printStackTrace();
			}
			break;
		case "multiply":
			System.out.println("Your answer is: " + calc.mult(UtilityScanner.returnInt(), UtilityScanner.returnInt()));
			break;
		default:
			System.out.println("No match found");
			break;

		}

	}
}
