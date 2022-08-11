package stocks_buy_and_sell;

public class MoreThanOneTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int prices[] = { 1, 4, 2, 8, 6, 7 };
		System.out.println(maxProfit(prices));

	}

	static int maxProfit(int[] prices) {
		int profit = 0;
		for (int i = 1; i < prices.length; i++) {
			if (prices[i] > prices[i - 1]) {
				profit += prices[i] - prices[i - 1];
			}
		}
		return profit;
	}

}
