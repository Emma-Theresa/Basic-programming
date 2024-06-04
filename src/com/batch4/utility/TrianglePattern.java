package com.batch4.utility;

public class TrianglePattern {
	public static void main(String[] args) {
		int input = 7;
		printPattern(input);
	}

	private static void printPattern(int input) {
		int mid = (input + 1) / 2;

		for (int i = 1; i < mid; i++) {
			for (int j = 0; j < (mid - i); j++) {
				System.out.print("  ");
			}
			for (int j = i; j > 0; j--) {
				if (j % 2 == 0) {
					System.out.print(1 + " ");
				} else {
					System.out.print(0 + " ");
				}
			}
			for (int j = 2; j <= i; j++) {
				if (j % 2 == 0) {
					System.out.print(1 + " ");
				} else {
					System.out.print(0 + " ");
				}
			}
			System.out.println();
		}

		for (int i = mid; i > 0; i--) {

			if (i % 2 == 0) {
				System.out.print(1 + " ");
			} else {
				System.out.print(0 + " ");
			}
		}
		for (int i = 2; i <= mid; i++) {
			if (i % 2 == 0) {
				System.out.print(1 + " ");
			} else {
				System.out.print(0 + " ");
			}
		}
		System.out.println();

		for (int i = mid - 1; i > 0; i--) {
			for (int j = 0; j < (mid - i); j++) {
				System.out.print("  ");
			}
			for (int j = i; j > 0; j--) {
				if (j % 2 == 0) {
					System.out.print(1 + " ");
				} else {
					System.out.print(0 + " ");
				}
			}
			for (int j = 2; j <= i; j++) {
				if (j % 2 == 0) {
					System.out.print(1 + " ");
				} else {
					System.out.print(0 + " ");
				}
			}
			System.out.println();
		}
	}
}
