package com.simplilearn.fizzbuzz;

public class FizzBuzzProblem {

	public static void main(String[] args) {
		// TODO FizzBuzzProblem
		printData();
	}

	private static void printData() {
		for(int pos=1 ; pos<=100; pos++ ) {
			
			if((pos % 3)==0 && (pos % 5)==0) {  // (pos % (3*5))==0
				System.out.println("Fizz Buzz");
			} else if((pos % 3)==0) {
				System.out.println("Fizz");
			} else if((pos % 5)==0) {
				System.out.println("Buzz");
			} else {
				System.out.println(pos);
			}
		}
	}
}
