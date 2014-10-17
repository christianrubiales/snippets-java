package string;

import java.util.Arrays;

public class AnagramsUsingArraysSortLinearithmic {

	public static void main(String[] args) {
		System.out.println(areAnagrams("silent", "listen")); // true
		System.out.println(areAnagrams("abc", "def")); // false
	}
	
	public static boolean areAnagrams(String s1, String s2) {
		if (s1.length() != s2.length()) {
			return false;
		} else {
			char[] b1 = s1.toCharArray();
			char[] b2 = s2.toCharArray();
			Arrays.sort(b1); // O(n log n)
			Arrays.sort(b2); // O(n log n)
			
			for (int i = 0; i < s1.length(); i++) {
				if (b1[i] != b2[i]) {
					return false;
				}
			}
		}
		
		return true;
	}

}
