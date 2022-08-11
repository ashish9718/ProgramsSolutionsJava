
public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "abcde";
		reverse(s.toCharArray(), 0, s.length() - 1);

	}

	static void reverse(char[] c, int i, int j) {

		if (i > j) {
			System.out.println(c);
			return;
		}

		swap(c, i++, j--);

		reverse(c, i, j);
	}

	static void swap(char[] c, int i, int j) {
		char temp = c[i];
		c[i] = c[j];
		c[j] = temp;
	}

}
