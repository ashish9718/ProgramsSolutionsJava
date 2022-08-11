package CyclicSortQuestions;

import java.util.Arrays;

public class FindDuplicateNo {
	public static void main(String[] args) {

		int a[] = { 4, 3, 2, 1, 2 };
		System.out.println(duplicateNumber(a));

	}

	static int duplicateNumber(int[] a) {
		int i = 0;
		while (i < a.length) {
			if (a[i] != i + 1) {
				int correctIndex = a[i] - 1;
				if (a[i] != a[correctIndex]) {
					swap(a, i, correctIndex);
				} else {
					return a[i];
				}
			} else {
				i++;
			}

		}
		return -1;
	}

	static void swap(int[] c, int i, int j) {
		int temp = c[i];
		c[i] = c[j];
		c[j] = temp;
	}
}
