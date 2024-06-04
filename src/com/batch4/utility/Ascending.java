package com.batch4.utility;
 
public class Ascending {
 
    public static void main(String[] args) {
        int array[] = {1,9,4,7};
        System.out.println("Array in ascending order:");
        AscendingOrder(array);
    }
 
    private static void AscendingOrder(int[] array) {
        int length = array.length;
        
            int smallest=largestOfArray(array);
            int secondsmallest=largestOfArray(array);
            int thirdsmallest=largestOfArray(array);
            int fourthsmallest=largestOfArray(array);
            for( int i=0;i<length;i++) {
            	if(array[i]<smallest) {
            	fourthsmallest=thirdsmallest;
            	thirdsmallest=secondsmallest;
            	secondsmallest=smallest;
            	smallest=array[i];
            }
            	else if(array[i]<secondsmallest) {
            		fourthsmallest=thirdsmallest;
            		thirdsmallest=secondsmallest;
            		secondsmallest=array[i];
            	}
            	else if(array[i]<thirdsmallest) {
            		fourthsmallest=thirdsmallest;
            		thirdsmallest=array[i];
            	}
            	else if(array[i]<fourthsmallest) {
            		fourthsmallest=array[i];
            	}
            }
            System.out.println(smallest+ " "+secondsmallest+" "+thirdsmallest+" "+fourthsmallest);
            	
        }
        
    
 
    private static int largestOfArray(int[] array) {
    	int largest=0;
		for(int i=0;i<array.length;i++) {
			if (array[i]>largest) {
				largest=array[i];
			}
		}
		return largest;
 
	}
 

}
 