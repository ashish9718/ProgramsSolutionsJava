package sorting;

import java.util.Arrays;

public class InsertionSort {
	public static void main(String[] args) {

		int a[] = { 1, 5, 6, 7, 2, 3, 9 };
		sort(a, a.length);
		System.out.println(Arrays.toString(a));
	}

	static void sort(int[] a, int n) {

		for (int i = 1; i < n ; i++) {
			int temp = a[i];
			int j=i-1;
			while(j>=0 && a[j]>temp) {
				a[j+1]=a[j];
				j--;
			}
			a[j+1]=temp;
		}
	}

}
