package CyclicSortQuestions;

import java.util.ArrayList;

public class FindAllMissingNumbers {
	public static void main(String[] args) {

		int a[] = { 4, 3, 2, 7, 8, 2, 3, 1 }; // range 1,n
		System.out.println(missingNumberUsingCyclicSort(a));
	}

	static ArrayList<Integer> missingNumberUsingCyclicSort(int[] a) {
		ArrayList<Integer> list = new ArrayList<>();

		int i = 0;
		while (i < a.length) {
			int correctIndex = a[i] - 1;
			if (a[i] != a[correctIndex]) {
				swap(a, i, correctIndex);
			} else {
				i++;
			}
		}

		for (int j = 0; j < a.length; j++) {
			if (a[j] - 1 != j) {
				list.add(j + 1);
			}
		}
		return list;
	}

	static void swap(int[] c, int i, int j) {
		int temp = c[i];
		c[i] = c[j];
		c[j] = temp;
	}
}
