package CyclicSortQuestions;

import java.util.Arrays;

public class MissingNo {
	public static void main(String[] args) {

		int a[] = { 4, 0, 2, 1 };
		System.out.println(missingNumber(a));
		System.out.println(missingNumberUsingCyclicSort(a));
		System.out.println(missingNumberUsingBits(a));

	}

	static int missingNumber(int[] nums) {
		int n = nums.length;
		int totalSum = n * (n + 1) / 2;
		int sum = 0;
		for (int i = 0; i < n; i++) {
			sum += nums[i];
		}
		return totalSum - sum;
	}

	static int missingNumberUsingBits(int[] nums) {
		int n = nums.length;
		int ans = n;
		for (int i = 0; i < n; i++) {
			ans ^= i;
			ans ^= nums[i];
		}
		return ans;
	}

	static int missingNumberUsingCyclicSort(int[] a) {
		int i = 0;
		while (i < a.length) {
			int correctIndex = a[i];
			if (a[i] < a.length && a[i] != a[correctIndex]) {
				swap(a, i, correctIndex);
			} else {
				i++;
			}
		}

		for (int j = 0; j < a.length; j++) {
			if (a[j] != j) {
				return j;
			}
		}
		return a.length;
	}

	static void swap(int[] c, int i, int j) {
		int temp = c[i];
		c[i] = c[j];
		c[j] = temp;
	}
}
