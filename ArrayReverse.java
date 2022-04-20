package com.oops;

import java.util.Arrays;

public class ArrayReverse {

	public static int[] reverse(int[] array) {
		if (array == null || array.length <= 1) {
			System.out.println("Invalid array.");
		}
		for (int i = 0; i < array.length / 2; i++) {
			int temp = array[i];
			array[i] = array[array.length - 1 - i];
			array[array.length - 1 - i] = temp;
		}
		return array;
	}

	public static void main(String[] args) {
		int[] input = { 7, 8, 5, 6, 3 };
		System.out.println("Reversed array" + Arrays.toString(reverse(input)));
	}
}