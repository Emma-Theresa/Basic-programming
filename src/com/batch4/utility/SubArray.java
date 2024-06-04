package com.batch4.utility;

public class SubArray {

	public static void main(String[] args) {
		int array[] = { 9, 1, 2, 3, 4, 5,9 };
		int sum = 9;
		subArray(array, sum);
	}

	private static void subArray(int[] array, int sum) {
		for (int i = 0; i < array.length; i++) {
			int count = 0;
			for (int j = i; j < array.length; j++) {
				count = count + array[j];
				if (array[j] == sum) {
					break;
				} 
				if (count == sum) {
					System.out.println("First Index= " + i + " Last Index=" + (j));
					break;
				}
			}
		}
	}
}
