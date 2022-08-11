
public class TrailingZeroesInaFactorial {

	public static void main(String[] args) {

		int n = 12;
		System.out.println("Trailing zeroes in " + n + "! (" + getfactorialUsingRecursion(n) + ") = " + getZeroes(n));
	}

	static int getZeroes(int n) {
		int res = 0;
		for (int i = 5; i <= n; i = i * 5) {
			res = res + (n / i);
		}

		return res;
	}

	static int getfactorialUsingRecursion(int n) {
		if (n == 1) {
			return 1;
		}

		return n * getfactorialUsingRecursion(n - 1);
	}

}
