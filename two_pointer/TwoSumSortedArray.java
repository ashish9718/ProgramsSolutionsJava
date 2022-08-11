package two_pointer;

import java.util.Arrays;
import java.util.HashMap;

class TwoSumSortedArray {

	public static void main(String[] args) {
		int a[] = { 2, 3, 4 };
		int target = 6;
		System.out.println(Arrays.toString(twoSum(a, target))); // return indexes of pairs
	}

	static int[] twoSum(int[] a, int target) {
		int res[] = { -1, -1 };
		int i = 0;
		int j = a.length - 1;

		while (i < j) {
			int sum = a[i] + a[j];
			if (sum == target) {
				res[0] = i;
				res[1] = j;
				return res;
			} else if (sum > target) {
				j--;
			} else {
				i++;
			}
		}
		return res;
	}
}