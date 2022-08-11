package Hashmap_questions;

import java.util.Arrays;
import java.util.HashMap;

class TwoSumUnsortedArray {

	public static void main(String[] args) {
		int a[] = {  3, 2 ,4};
		int target = 6;
		System.out.println(Arrays.toString(twoSum(a, target))); // return indexes of pairs
	}

	static int[] twoSum(int[] a, int target) {
		int res[] = { -1, -1 };

		HashMap<Integer, Integer> map = new HashMap<>();

		for (int i = 0; i < a.length; i++) {
			if (map.containsKey(target - a[i])) {
				res[1] = i;
				res[0] = map.get(target - a[i]);
			} else
				map.put(a[i], i);
		}

		return res;
	}
}