
public class Palindrom {

	public static void main(String[] args) {

		int n = 101;

		if (n == reverse(n)) {
			System.out.println(n + " is palindrome");
		} else {
			System.out.println(n + " is not a palindrome");
		}

		String s = "abcba";

		if (reverseString(s, 0, s.length() - 1)) {
			System.out.println(s + " is palindrome");
		} else {
			System.out.println(s + " is not a palindrome");
		}

	}

	static boolean reverseString(String str, int start, int end) {
		if (str.length() == 0) {
			return true;
		}

		if (start >= end) {
			return true;
		}

		if (str.charAt(start) != str.charAt(end)) {
			return false;
		}

		return reverseString(str, start + 1, end - 1);

	}

	static int reverse(int n) {
		int newN = 0;
		while (n > 0) {
			int r = n % 10;
			newN = newN * 10 + r;
			n = n / 10;
		}
		return newN;
	}

}
