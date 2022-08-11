package Hashmap_questions;

import java.util.HashMap;

public class CountSubArraysWithSumK {

	public static void main(String[] args) {
		int a[] = { 4, 5, 1, 3, 2, 3, 4 };
		int k = 9; // given sub array sum
		System.out.println(countSubArray(a, k));
	}

	private static int countSubArray(int[] a, int k) {

		int sum = 0, count = 0;
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		map.put(0, 1);

		for (int i = 0; i < a.length; i++) {
			sum += a[i];
//			if (sum == k)
//				count++;

			if (map.containsKey(sum - k)) {
				count += map.get(sum - k);
			}

            map.put(sum, map.getOrDefault(sum, 0) + 1);

		}

		return count;
	}
}
