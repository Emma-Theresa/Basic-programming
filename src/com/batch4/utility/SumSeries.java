package com.batch4.utility;

public class SumSeries {

		public static void main(String[] args) {
			int input = 3;
			sumOfFactorial(input);
		}

		private static void sumOfFactorial(int input) {
			float factorialsum = 0;
			for (int i = 1; i <= input; i++) {
				factorialsum = factorialsum + (i / factorial(i));
			}
			System.out.println("The Sum Of Factorial is : " + factorialsum);
		}

		private static float factorial(int n) {
			int factorial = 1;
			for (int i = 1; i <= n; i++) {
				factorial = factorial * i;
			}
			return factorial;
		}
	}


