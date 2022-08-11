package SlidingWindow;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class AnagramsInString {
	public static void main(String[] args) {
		String s = "iabaoboa", p = "ab";
		System.out.print(findAnagrams(s, p));
	}

	static List<Integer> findAnagrams(String s, String p) {

		List<Integer> result = new ArrayList<Integer>();

		if (s.length() == 0 || s == null)
			return result;

		int[] char_counts = new int[26];

		for (char c : p.toCharArray()) {
			char_counts[c - 'a']++;
		}

		int left = 0;
		int right = 0;
		int count = p.length();

		while (right < s.length()) {
			if (char_counts[s.charAt(right++) - 'a']-- >= 1)
				count--;
			if (count == 0)
				result.add(left);
			if (right - left == p.length() && char_counts[s.charAt(left++) - 'a']++ >= 0)
				count++;
		}
		return result;
	}
}
