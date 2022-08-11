package sorting;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {

		int a[] = { 1, 5, 6, 7, 2, 3, 9 };
		sort(a, a.length);
		System.out.println(Arrays.toString(a));
	}

	static void sort(int[] a, int n) {

		for (int i = 0; i < n - 1; i++) {
			int min = i;
			for (int j = i + 1; j < n; j++) {
				if (a[j] < a[min]) {
					min = j;
				}
			}
			if (min != i) {
				swap(a, i, min);
			}
		}
	}

	static void swap(int[] a, int i, int j) {
		a[i] = a[i] ^ a[j];
		a[j] = a[i] ^ a[j];
		a[i] = a[i] ^ a[j];
	}
}
