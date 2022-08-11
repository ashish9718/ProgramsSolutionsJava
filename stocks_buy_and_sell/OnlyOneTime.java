package stocks_buy_and_sell;

public class OnlyOneTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int prices[] = { 1, 4, 2, 8, 6, 7 };
		System.out.println(maxProfit(prices));

	}

	static int maxProfit(int[] a) {
		int profit = 0;
		int min = a[0];
		for (int i = 0; i < a.length; i++) {
			min = Math.min(min, a[i]);
			profit = Math.max(profit, a[i] - min);
		}
		return profit;
	}

}
