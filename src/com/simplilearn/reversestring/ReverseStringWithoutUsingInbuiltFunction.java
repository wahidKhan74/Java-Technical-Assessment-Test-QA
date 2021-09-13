package com.simplilearn.reversestring;

public class ReverseStringWithoutUsingInbuiltFunction {

	public static void main(String[] args) {
		
		String str = "Today is a good day !";
		
		reverString(str);
	}

	public static void reverString(String input) {
		// convert string to char array
		char[] charStrs = input.toCharArray();
		String reverseStr = "";
		
		// for loop for iterating 
		for (int index = charStrs.length-1 ; index >=0 ; index--) {
			reverseStr += charStrs[index];
		}
		System.out.println(reverseStr);
	}
}
