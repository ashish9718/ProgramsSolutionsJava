package Hashmap_questions;

import java.util.HashMap;

public class SubArrayWithGivenSum {

	public static void main(String[] args) {
		int a[] = { 5, 15, -10, 6, -3 };
		int sum = 16;
		subArray(a, sum);
	}

	private static void subArray(int[] a, int sum) {

		int curSum = 0, start = 0, end = -1;
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		for (int i = 0; i < a.length; i++) {
			curSum += a[i];
			if (curSum - sum == 0) {
				start = 0;
				end = i;
				break;
			}
			if (map.containsKey(curSum - sum)) {
				start = map.get(curSum - sum) + 1;
				end = i;
				break;
			}
			map.put(curSum, i);
		}
		
		if (end == -1) {
			System.out.println("not found");
		} else {
			for (int k = start; k <= end; k++) {
				System.out.print(a[k] + ", ");
			}
		}

	}

}
