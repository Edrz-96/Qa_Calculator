package com.qa.main;

import com.qa.menu.Menu;
import com.qa.utility.UtilityScanner;

public class Runner {

	public static void main(String[] abc) throws ArithmeticException {
		
		Menu menu = new Menu();
		menu.run();
		UtilityScanner.close();
		
	}

}
