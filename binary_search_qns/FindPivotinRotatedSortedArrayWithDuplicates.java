package binary_search_qns;

public class FindPivotinRotatedSortedArrayWithDuplicates {
	public static void main(String args[]) {
		// Let us search 3 in below array
		int arr[] = { 5, 6, 10, 5, 5, 5 ,5 };
		int n = arr.length;
		int p = findPivot(arr, 0, n - 1); // index of pivot
		System.out.println(" a[" + p + "] = " + arr[p]);
	}

	static int findPivot(int arr[], int low, int high) {
		// base cases
		if (high < low)
			return -1;
		if (high == low)
			return low;

		/* low + (high - low)/2; */
		int mid = (low + high) / 2;
		if (mid < high && arr[mid] > arr[mid + 1])
			return mid;
		if (mid > low && arr[mid] < arr[mid - 1])
			return (mid - 1);

		if (arr[low] >= arr[mid])
			return findPivot(arr, low, mid - 1);
		return findPivot(arr, mid + 1, high);
	}
}
