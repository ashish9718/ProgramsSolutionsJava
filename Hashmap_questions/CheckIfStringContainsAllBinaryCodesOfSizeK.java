package Hashmap_questions;

import java.util.HashSet;

public class CheckIfStringContainsAllBinaryCodesOfSizeK {

	public static void main(String[] args) {
		String s = "0011001110";
		int k = 2;

		System.out.println(hasAllCodes(s, k));
	}

	static boolean hasAllCodes(String s, int k) {

		if (k > s.length())
			return false;

		HashSet<String> set = new HashSet<String>();

		for (int i = 0; i <= s.length() - k; i++) {
			set.add(s.substring(i, i + k));
		}
		System.out.println(set);
		return set.size() == 1<<k;
	}
}
