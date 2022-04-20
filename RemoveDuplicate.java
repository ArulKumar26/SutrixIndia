package com.oops;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class RemoveDuplicate {

	public static void main(String[] args) {
		int arr[] = { 1, 5, 5, 20, 40, 20 };
		int length = arr.length;
		Set<Integer> set = new HashSet<Integer>();
		for (int i = 0; i < length; i++) {
			set.add(arr[i]);
		}
		Iterator<Integer> it = set.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}
}