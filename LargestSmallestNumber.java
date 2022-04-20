package com.oops;

public class LargestSmallestNumber {

	public static void main(String[] args) {
		int arr[] = { 1, 7, 5, 20, 40, 30 };
		int smallest = arr[0];
		int largest = arr[0];

		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > largest) {
				largest = arr[i];
			} else if (arr[i] < smallest) {
				smallest = arr[i];
			}
		}
		System.out.println("Smallest Number is : " + smallest);
		System.out.println("Largest Number is : " + largest);
	}
}