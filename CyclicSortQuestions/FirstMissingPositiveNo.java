package CyclicSortQuestions;

public class FirstMissingPositiveNo {
	public static void main(String[] args) {

		int a[] = { 4, -1, 2, 1 };
		System.out.println(firstMissingPositive(a));

	}

	static int firstMissingPositive(int[] a) {
		int i = 0;
		while (i < a.length) {
			int correctIndex = a[i] - 1;
			if (a[i] > 0 && a[i] <= a.length && a[i] != a[correctIndex]) {
				swap(a, i, correctIndex);
			} else {
				i++;
			}
		}

		for (int j = 0; j < a.length; j++) {
			if (a[j] != j + 1) {
				return j + 1;
			}
		}
		return a.length+1;
	}

	static void swap(int[] c, int i, int j) {
		int temp = c[i];
		c[i] = c[j];
		c[j] = temp;
	}
}
