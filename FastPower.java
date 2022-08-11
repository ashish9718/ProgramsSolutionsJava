
public class FastPower {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(fastPower(3, 5));
		System.out.println(fastPowerRecursion(3, 5));
	}

	static int fastPower(int a, int b) {
		int res = 1;
		while (b > 0) {

			if ((b & 1) != 0) {
				res = res * a;
			}
			a = a * a;
			b = b >> 1;
		}
		return res;
	}

	static int fastPowerRecursion(int a, int b) {
		if (b == 0) {
			return 1;
		}

		if ((b & 1) != 0) {
			return a * fastPowerRecursion(a, b - 1); // if odd
		} else {
			return fastPowerRecursion(a * a, b / 2); // if even
		}
	}
}
