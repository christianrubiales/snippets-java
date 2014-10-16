package string;

/**
 * @see http://www.geeksforgeeks.org/given-two-strings-find-first-string-subsequence-second/
 * @see http://en.wikipedia.org/wiki/Subsequence
 * @see http://ideone.com/8p9nlY
 */
public class Subsequence {

	public static void main(String[] args) {
		System.out.println(isSubsequence("AXY", "ADXCPY")); // true
		System.out.println(isSubsequence("AXY", "YADXCP")); // false
		System.out.println(isSubsequence("gksrek", "geeksforgeeks")); // true
		System.out.println(isSubsequence("ABD", "ABCDEF")); // true
		System.out.println(isSubsequence("ABD", "ABD")); // true
		System.out.println(isSubsequence("ABD", "ABC")); // false
		System.out.println(isSubsequence("ABD", "AB")); // false
		System.out.println(isSubsequence("", "")); // false
	}
	
	public static boolean isSubsequence(String str1, String str2) {
		int found = 0;
		char c1;
		for (int i = 0; i < str2.length(); i++) {
			c1 = str1.charAt(found);
			if (c1 == str2.charAt(i)) {
				found++;
				if (found == str1.length()) {
					return true;
				}
				continue;
			}
		}
		
		return false;
	}
}
