package SlidingWindow;

import java.util.Arrays;

public class PermutationInString {
//Given two strings s1 and s2, return true if s2 contains a permutation of s1, or false otherwise.
//In other words, return true if one of s1's permutations is the substring of s2.

	public static void main(String[] args) {
		String s1 = "ab", s2 = "eidbaooo";
		System.out.println(checkInclusion(s1, s2));
	}

	static boolean checkInclusion(String s1, String s2) {
		int[] map = new int[26];
		for (char c : s1.toCharArray())
			map[c - 'a']++;
		System.out.println(Arrays.toString(map));
		int j = 0, i = 0;
		int count_chars = s1.length();
		while (j < s2.length()) {
			if (map[s2.charAt(j++) - 'a']-- > 0)
				count_chars--;
			if (count_chars == 0)
				return true;
			if (j - i == s1.length() && map[s2.charAt(i++) - 'a']++ >= 0)
				count_chars++;
		}
		return false;
	}
}
