import java.util.Arrays;

public class KadaneAlgo {     // max sum of sub array

	public static void main(String[] args) {

		int a[] = { 5, -4, -2, 6, -8, 1 };
	

		System.out.println(maxSumSubArray(a));

	}

	static int maxSumSubArray(int[] a) {

		int maxSum = 0, curSum = 0;

		for (int i = 0; i < a.length; i++) {
			
			curSum += a[i];

//			if (curSum > maxSum) {
//				maxSum = curSum;
//			}

			maxSum = Math.max(curSum, maxSum);
			
			if (curSum < 0) {
				curSum = 0;
			}
		}
		
		return maxSum;
	}

}
