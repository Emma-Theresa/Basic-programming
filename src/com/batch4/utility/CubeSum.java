package com.batch4.utility;

public class CubeSum {

	public static void main(String[] args) {
		int input=1;
		cubeSum(input);
	}

	private static void cubeSum(int input) {
	if(input==0) {
		System.out.println("0");
	}
	else if(input==1) {
		System.out.println("1");
	}
	else {
	int num1=1;
	int num2=2;
	int sum=(num1*num1*num1)+(num2*num2*num2);
	int num3=0;
	for(int i=3;i<=input;i++) {	
		num3=num2+num1;
		sum=sum+(num3*num3*num3);
		num1=num2;
		num2=num3;
	}
	System.out.println(sum);	
	}
	}
}
