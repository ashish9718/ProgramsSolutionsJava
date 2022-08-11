package SlidingWindow;

public class ArithmeticSubArrays {

	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 4, 8, 9, 7, 8, 9, 6, 7, 5 };
		System.out.println(numberOfArithmeticSlices(a));
	}

	static int numberOfArithmeticSlices(int[] nums) {
		int curr = 0, total = 0;
		for (int i = 2; i < nums.length; i++)
			if (nums[i] - nums[i - 1] == nums[i - 1] - nums[i - 2]) {
				curr += 1;
				total += curr;
			} else {
				curr = 0;
			}
		return total;
	}
}
