package CyclicSortQuestions;

import java.util.Arrays;

public class SetMismatch {
	public static void main(String[] args) {

		int a[] = { 3, 2, 2};
		System.out.println(Arrays.toString(findSet(a)));
	}
	
	static int[] findSet(int[] a) {
		int i = 0;
		int ar[]= {-1,-1};
		while (i < a.length) {
			int correctIndex = a[i]-1;
			if (a[i] != a[correctIndex]) {
				swap(a, i, correctIndex);
			} else {
				i++;
			}
		}
		System.out.println(Arrays.toString((a)));

		for (int j = 0; j < a.length; j++) {
			if (a[j] != j+1) {
				ar[0]=a[j];
				ar[1]=j+1;
				return ar;
			}
		}
		return ar;
	}

	static void swap(int[] c, int i, int j) {
		int temp = c[i];
		c[i] = c[j];
		c[j] = temp;
	}
}
