package SlidingWindow;

import java.util.ArrayList;

public class MaxSumSubarraySizeK {

	public static void main(String[] args) {
		int a[] = { 100, 200, 300, 400 };
		int k = 2;
		System.out.println(maximumSumSubarray(k, a, a.length));
	}

	static long maximumSumSubarray(int k, int[] a, int n) {

		int sum = 0;
		int max = 0;
		int j = 0, i = 0;

		/*
		 * for (j = 0; j < k; j++) { sum += a[j]; max = sum; }
		 * 
		 * for (j = k; j < n; j++) { sum += a[j]; sum -= a[i]; max = Math.max(sum, max);
		 * i++; }
		 * 
		 */

		

		for (j = 0; j < n; j++) {
			sum += a[j];

			if (j >= k) {
				sum -= a[j-k];
//				sum -= a[i];
//				i++;
			}
			max = Math.max(sum, max);
		}

		return max;

	}

}
