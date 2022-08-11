package binary_search_qns;

public class PositionOfElementInInfiniteSortedArray {
	public static void main(String[] args) {

		int a[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 15, 40 }; // 9
		int k = 10;
		int pos = findRange(a, k);
		System.out.println(pos);
	}

	static int findRange(int a[], int k) {
		int s = 0;
		int e = 1;

		while (k > a[e]) {
			int t = e + 1;
			e = e + (e - s + 1) * 2;
			if (e > a.length - 1) {
				e = a.length - 1;
			}
			s = t;
		}
		return binarySearch(a, s, e, k);
	}

	static int binarySearch(int arr[], int l, int r, int x) {
		if (r >= l) {
			int mid = l + (r - l) / 2;
			if (arr[mid] == x)
				return mid;
			if (arr[mid] > x)
				return binarySearch(arr, l, mid - 1, x);
			return binarySearch(arr, mid + 1, r, x);
		}
		return -1;
	}

	
}
