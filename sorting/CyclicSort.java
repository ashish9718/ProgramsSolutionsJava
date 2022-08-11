package sorting;

import java.util.Arrays;

public class CyclicSort {
	public static void main(String[] args) {

		int a[] = { 1, 5, 6, 7, 2, 3, 9, 4, 8 };
		sort(a);
		System.out.println(Arrays.toString(a));
	}

	static void sort(int[] a) {
		int i = 0;
		while (i < a.length) {
			int correctIndex = a[i] - 1;
			if (a[i] != a[correctIndex]) {
				swap(a, i, correctIndex);
			} else {
				i++;
			}
		}
	}

	static void swap(int[] c, int i, int j) {
		int temp = c[i];
		c[i] = c[j];
		c[j] = temp;
	}
}
