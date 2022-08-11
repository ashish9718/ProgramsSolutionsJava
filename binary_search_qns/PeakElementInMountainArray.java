package binary_search_qns;

public class PeakElementInMountainArray {
	public static void main(String[] args) {

		int a[] = { 1, 2, 3, 4, 5, 6, 3, 2, 1, 0 };

		int max = max(a, 0, a.length - 1);

	}

	static int max(int a[], int s, int e) {
		int mid = (s + e) / 2;
		
		if (s == e) {
			System.out.println("Peak element = " + a[s] + " at index " + s);
			return a[s];
		}

		if (a[mid] > a[mid + 1]) {
			e = mid;
		} else {
			s = mid + 1;
		}

		return max(a, s, e);

	}

}
