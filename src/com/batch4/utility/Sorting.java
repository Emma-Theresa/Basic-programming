package com.batch4.utility;

public class Sorting {

	public static void main(String[] args) {
		int array[]= {0,1,2,0,1,2};
		sorting(array);

	}

	private static void sorting(int[] array) {
		int temp=0;
		for( int j=0;j<array.length;j++) {
	 for(int i=1;i<array.length;i++) {
		 if(array[i-1]>array[i]) {
			temp=array[i-1];
			array[i-1]=array[i];
			array[i]=temp;
		 }
	 }}
	 for(int i=0;i<array.length;i++) {
		 System.out.println(array[i]);
	 }
		
	}

}
