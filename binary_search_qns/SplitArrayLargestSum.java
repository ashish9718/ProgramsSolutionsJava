package binary_search_qns;

public class SplitArrayLargestSum {

	public static void main(String args[]) {
		int arr[] = { 7, 2, 5, 8, 10 }; // sum = 18 {7,2,5} & {8,10}
		int key = 2;
		int sum = splitArray(arr, key);
		System.out.println(sum);

	}

	static int splitArray(int a[], int m) {

		int start = 0, end = 0;
		for (int i = 0; i < a.length; i++) {
			start = Math.max(start, a[i]);     // maximum element in array
			end += a[i];                        // sum of array
		}

		while (start < end) {
			int mid = (start + end) >> 1;
			int sum = 0, pieces = 1;
			for (int x : a) {
				if (sum + x > mid) {
					sum = x;
					pieces++;
				} else {
					sum += x;
				}
			}
			if (pieces > m) {
				start = mid + 1;
			} else {
				end = mid;
			}
		}
		return end;
	}

}
