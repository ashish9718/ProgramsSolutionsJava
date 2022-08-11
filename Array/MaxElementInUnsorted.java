package Array;

import java.util.Arrays;

public class MaxElementInUnsorted {
	public static void main(String[] args) {

		int a[] = { 1, 2, 8, 6, 4, 5 };

		Arrays.sort(a);    // nlogn
		
		System.out.println(max(a, a.length));

	}

	static int max(int a[], int n) {
		return a[n - 1];
	}

}
