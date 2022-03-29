package com.qa.utility;

import java.util.Scanner;

public class UtilityScanner {

	private static Scanner scan = new Scanner(System.in);
	
	
	public static void close() {
//		To close our scanner after we're finished
		scan.close();
	}

	public static String returnString() {
//		To get user String input
		return scan.nextLine().toLowerCase();
	}

	public static double returnInt() {
// 		Returns a double for calc methods		
		System.out.println("Please enter a number");
		return Double.parseDouble(scan.nextLine());
	}

}
