
import java.util.*;

class Catalan {

	static void catalan(int n) {
		int cat = 1;

		// For the first number
		System.out.print(cat + " "); // C(0)

		// Iterate till N
		for (int i = 1; i < n; i++) {
			// Calculate the number
			// and print it
			cat *= (4 * i - 2);
			cat /= (i + 1);
			System.out.print(cat + " ");
		}
	}


	public static void main(String args[]) {
		int n = 10;

		catalan(n);
	}
}

