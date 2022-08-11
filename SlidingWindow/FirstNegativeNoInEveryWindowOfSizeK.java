package SlidingWindow;

import java.util.ArrayList;

public class FirstNegativeNoInEveryWindowOfSizeK {
	public static void main(String[] args) {
		int a[] = { 12, -1, -7, 8, -15, 30, 16, 18 }; // -1,-1,-7,-15,-15
		int k = 4;
		printNegativeNo(a, k);
	}

	static void printNegativeNo(int[] a, int k) {

		ArrayList<Integer> list = new ArrayList<Integer>();

		for (int i = 0; i < a.length; i++) {
			if (a[i] < 0) {
				list.add(a[i]);
			}
			
			if (i >= k) {
				if (list.contains(a[i - k])) {
					list.remove(0);
				}
			}
			
			if (i >= k - 1) {
				System.out.print(list.isEmpty() ? 0 : list.get(0) + ", ");
			}

		}

	}

}
