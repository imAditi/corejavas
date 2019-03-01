package com.yash.tdd_demo.component;

public class FizzBuzz {


	public static String getAnswerFor(int number) {
		CheckForZero(number);
		return ComputeNumber(number);
	}
	private static void CheckForZero(int number) {
		if(number==0) {
			throw new IllegalArgumentException();
		}
	}
	private static String ComputeNumber(int number) {
		String answer= String.valueOf(number);
	
		if(isDivisibleByThree(number) && isDivisibleByFive(number)) {
			answer = "FizzBuzz";
		}
		else if (isDivisibleByThree(number)) {
			answer = "Fizz";
		}
		else if (isDivisibleByFive(number)) {
			answer="Buzz";
		}
		return answer;
	}
	private static boolean isDivisibleByFive(int number) {
		return number%5==0;
	}

	private static boolean isDivisibleByThree(int number) {
		return number % 3 == 0;
	}
}
