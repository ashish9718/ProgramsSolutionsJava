
public class Permutation {

	public static void main(String[] args) {

		String s = "abc";
		permute(s, 0, s.length() - 1);
		System.out.println();
		printPermutation(s, 0, ""); //
	}

	static void permute(String s, int l, int r) {
		if (l == r) {
			System.out.print(s + " ");
			return;
		}

		for (int i = l; i <= r; i++) {
			s = swap(s, l, i);
			permute(s, l + 1, r);
			s = swap(s, l, i);
		}

	}

	static String swap(String s, int l, int i) {

		char[] sArr = s.toCharArray();

		char temp = sArr[l];
		sArr[l] = sArr[i];
		sArr[i] = temp;

		return new String(sArr);
	}

	public static void printPermutation(String str, int idx, String perm) {
		if (str.length() == 0) {
			System.out.print(perm +" ");
			return;
		}

		for (int i = 0; i < str.length(); i++) {
			char currChar = str.charAt(i);
			String newStr = str.substring(0, i) + str.substring(i + 1);
			printPermutation(newStr, idx + 1, perm + currChar);
		}
	}

}
