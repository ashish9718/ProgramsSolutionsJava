package Array;

public class MaxElementInSortedArray {

	public static void main(String[] args) {

		int a[] = { 1, 2, 3,  4, 5 };

		System.out.println(max(a, a.length));
		
	}

	static int max(int a[], int n) {
		return a[n-1];

	}

}
