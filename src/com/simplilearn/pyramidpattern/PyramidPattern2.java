package com.simplilearn.pyramidpattern;

import java.util.Scanner;

public class PyramidPattern2 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the row to print :");
		int rows = input.nextInt();
		
		System.out.println("Output Pattern :");
		printPattern(rows);
	}
	
	private static void printPattern(int rows) {
		// for loop for the rows
		for (int i = 1; i <= rows ; i++) {
			
			// white spaces in the front of numbers
			int numberOfWhiteSpaces = rows-i;
			
			// print leading white spaces
			printData(" ",numberOfWhiteSpaces);
			
			//print numbers
			printData(i +" ",i);
			
			//move to next line
			System.out.println("");
			
		}
	}

	//utility function to print string given times
	private static void printData(String str, int times) {
		for (int j = 0; j < times; j++) {
			System.out.print(str);
		}
	}
}
