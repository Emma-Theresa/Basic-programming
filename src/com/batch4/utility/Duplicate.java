package com.batch4.utility;

public class Duplicate {

    public static void main(String[] args) {
        int array[] = {3, 3, 3, 1, 2, 1, 5};
        findDuplicates(array);
    }

    public static void findDuplicates(int array[]) {
        System.out.println("Duplicate elements in the array are: ");
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    System.out.println(array[i]);
                    break; 
                }
            }
        }
    }
}



