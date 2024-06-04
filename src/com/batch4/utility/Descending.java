package com.batch4.utility;

public class Descending {

	public static void main(String[] args) {
         int number1=2;
         int number2=4;
         int number3=8;
         greatest(number1, number2, number3);
 
	}

	private static void greatest(int number1, int number2, int number3) {
		if((number1>=number2) && (number1>= number3)) {
			System.out.println(number1);
			if(number2 >=number3) {
				System.out.println(number2);
				System.out.println(number3);
			}
			else {
				
				System.out.println(number3);
				System.out.println(number2);
			}	
		}
		if((number2>=number1) && (number2>= number3)) {
			System.out.println(number2);
			if(number1 >=number3) {
				System.out.println(number1);
				System.out.println(number3);
			}
			else {
				
				System.out.println(number3);
				System.out.println(number1);
			}	
		}
		if((number3>=number1) && (number3>= number2)) {
			System.out.println(number3);
			if(number2 >=number1) {
				System.out.println(number2);
				System.out.println(number1);
			}
			else {
				
				System.out.println(number1);
				System.out.println(number2);
			}	
		}
	}
}      
