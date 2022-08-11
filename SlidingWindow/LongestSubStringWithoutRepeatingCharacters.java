package SlidingWindow;

public class LongestSubStringWithoutRepeatingCharacters {

	public static void main(String[] args) {
		String s = "abcdad";
		System.out.print(lengthOfLongestSubstring(s));
	}

	static int lengthOfLongestSubstring(String s) {
		int ans = 0;
		int count[] = new int[26];
		int l = 0, r = 0;

		while (r < s.length()) {
			count[s.charAt(r)-'a']++;

			while (count[s.charAt(r)-'a'] > 1) {
				count[s.charAt(l)-'a']--;
				l++;
			}
			ans = Math.max(ans, r - l + 1);
			r++;
		}

		return ans;
	}
}
