package sorting;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {

		int a[] = { 1, 5, 6, 7, 2, 3, 9 };
		sort(a, a.length);
		System.out.println(Arrays.toString(a));
	}

	static void sort(int[] a, int n) {

		for (int i = 0; i < n - 1; i++) {
			boolean swapped = false;
			for (int j = 0; j < n - i - 1; j++) {
				if (a[j + 1] < a[j]) {
					swap(a, j + 1, j);
					swapped = true;
				}
			}
			if (!swapped) {
				break;
			}
		}
	}

	static void swap(int[] a, int i, int j) {
		a[i] = a[i] ^ a[j];
		a[j] = a[i] ^ a[j];
		a[i] = a[i] ^ a[j];
	}

}
