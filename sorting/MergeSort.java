package sorting;

import java.util.Arrays;

public class MergeSort {
	public static void main(String[] args) {

		int a[] = { 1, 5, 6, 7, 2, 3, 9 };
		sort(a, 0, a.length - 1);
		System.out.println(Arrays.toString(a));
	}

	static void sort(int[] a, int l, int r) {

		if (l < r) {
			int mid = (l + r) / 2;
			sort(a, l, mid);
			sort(a, mid + 1, r);
			merge(a, l, mid, r);
		}
	}

	static void merge(int[] a, int l, int mid, int r) {
		int i = l, j = mid + 1, k = l;
		int b[] = new int[a.length];
		
		while (i <= mid && j <= r) {
			if (a[i] < a[j]) {
				b[k] = a[i];
				i++;
			} else {
				b[k] = a[j];
				j++;
			}
			k++;
		}

		if (i > mid) {
			while (j <= r) {
				b[k] = a[j];
				j++;
				k++;
			}
		} else {
			while (i <= mid) {
				b[k] = a[i];
				i++;
				k++;
			}
		}

		for (int k1 = l; k1 <= r; k1++) {
			a[k1] = b[k1];
		}
	}

}
