package com.batch4.utility;

public class MissingNumber {

	public static void main(String[] args) {
		int input=10;
	int array[]= {1,3,4,5};
	
	missingNumber(array,input);

	}

	private static void missingNumber(int[] array, int input) {
		int check=0;
		int missing=0;
		for(int i=1;i<input;i++) {
			check = 1;
			missing=0;
			
			for(int j=0;j<array.length;j++) {
				if(i==array[j]) {
			      check=1;
			      break;
				}
				else {
					check=0;
					missing=i;
				}
			}
			if(check==0) {
				System.out.println(missing);
		}
	
	}

}
}
