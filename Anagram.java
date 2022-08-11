import java.util.HashMap;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "abc", s2 = "caab";
		System.out.println(checkAnagram(s1, s2));

	}

	static boolean checkAnagram(String s1, String s2) {

		s1 = s1 + s2;
		
		HashMap<Character, Integer> map = new HashMap<>();

		for (int i = 0; i < s1.length(); i++) {
			if (map.containsKey(s1.charAt(i)))
				map.remove(s1.charAt(i));
			else
				map.put(s1.charAt(i), 1);
		}
		
		return map.isEmpty();
	}

}
