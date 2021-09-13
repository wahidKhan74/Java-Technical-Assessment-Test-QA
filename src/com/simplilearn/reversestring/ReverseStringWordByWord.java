package com.simplilearn.reversestring;

import java.util.Arrays;
import java.util.regex.Pattern;

public class ReverseStringWordByWord {

	public static void main(String[] args) {
		String input = "Today is a wonderfull day!";
		System.out.println(reverseWords(input));
	}
	
	// Method to reverse words of string
	public static String reverseWords(String str) {
		// specifying the white space pattern to split string
		Pattern pattern = Pattern.compile("\\s");
		
		String tmp[] = pattern.split(str);
		// System.out.println(Arrays.toString(tmp));
		String result = "";
		
		//iterate over the temp array for string reversal
		for (int index = 0; index < tmp.length; index++) {
			//only one word in string
			if(index == tmp.length-1) {
				result = tmp[index]+result;
			} else {
				result =" "+tmp[index]+result;
			}
		}
		return result;
	}

	
}
