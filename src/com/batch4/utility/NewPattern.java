package com.batch4.utility;

public class NewPattern {

	public static void main(String[] args) {
		int input =4;
		rightPattern(input);
	}

	public static void rightPattern(int input) {
		for(int i=0;i<input;i++) {
			for(int j =0;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println("");
		
		}
		
	}

}
