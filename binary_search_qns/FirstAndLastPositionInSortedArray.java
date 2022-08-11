package binary_search_qns;

public class FirstAndLastPositionInSortedArray {

	public static void main(String[] args) {

		int a[] = { 1, 2, 3, 3, 3, 4, 5, 6 }; // 2,4
		int target = 3;

		int start = max(a, target, true);
		int end = max(a, target, false);
		System.out.println(start + "," + end);
	}

	static int max(int a[], int k, Boolean isfirstOccurence) {
		int ans = -1;
		int s = 0;
		int e = a.length - 1;

		while (s <= e) {
			int mid = (s + e) >> 1;

			if (k < a[mid]) {
				e = mid - 1;
			} else if (k > a[mid]) {
				s = mid + 1;
			} else {
				ans = mid;
				if (isfirstOccurence) {
					e = mid - 1;
				} else {
					s = mid + 1;
				}
			}
		}
		return ans;
	}

}
