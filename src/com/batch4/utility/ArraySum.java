package com.batch4.utility;

public class ArraySum {

	public static void main(String[] args) {
		int array[]= {2,3,4,6,5};
		int sum=8;
		sumArray(array, sum);

	}

	private static void sumArray(int[] array, int sum) {
		int count=0;
		for(int i=0;i<array.length;i++) {
			for(int j=i+1;j<array.length;j++) {
				if(sum==(array[i]+array[j])) {
					count++;
				}
			}
		}
		System.out.println("No of pairs whose sum is "+sum+"="+ count);
	}

}
