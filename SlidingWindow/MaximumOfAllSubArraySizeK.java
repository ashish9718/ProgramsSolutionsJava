package SlidingWindow;

public class MaximumOfAllSubArraySizeK {
	public static void main(String[] args) {
		int a[] = { 1, 3, -1, -3, 5, 3, 6, 7 };//3,5,5,6,7
		int k = 4;
		maxOfAllSubArrays(a, a.length,k);
	}

	static void maxOfAllSubArrays(int[] a, int n ,int k) {

		int max=Integer.MIN_VALUE;
		
		for(int i=0;i<n;i++) {
			max=Math.max(max, a[i]);
			
			if(i>=k-1) {
				System.out.print(a[i]+ " ");
			}
		}
		
		
	}
}
