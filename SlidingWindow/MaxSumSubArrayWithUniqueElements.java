package SlidingWindow;

import java.util.HashSet;

public class MaxSumSubArrayWithUniqueElements {

	public static void main(String[] args) {
		int a[] = { 2, 3, 4, 2, 4, 5, 6 };
		System.out.println(maxSumSubAray(a, a.length));
	}

	private static int maxSumSubAray(int[] a, int length) {
		int current = 0, ans = 0;
		HashSet<Integer> set = new HashSet<>();

		for (int i = 0, j = 0; j < a.length; j++) {
			while (set.contains(a[j])) {
				set.remove(a[i]);
				current -= a[i];
				i++;
			}
			set.add(a[j]);
			current += a[j];
			ans = Math.max(ans, current);
		}
		return ans;
	}

}
