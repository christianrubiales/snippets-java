package string;

public class FindSubstringBruteForce {

	public static int findSubstring(String haystack, String needle) {
		
		for (int i = 0; i <= haystack.length() - needle.length(); i++) {
			for (int j = 0; j < needle.length(); j++) {
				if (haystack.charAt(i + j) == needle.charAt(j)) {
					if (j == needle.length() - 1) {
						return i;
					}
				} else {
					break;
				}
			}
		}
		
		return -1;
	}
	
	public static void main(String[] args) {
		System.out.println(findSubstring("0123456789", "567"));//5
		System.out.println(findSubstring("bananabanana", "nab"));//4
		System.out.println(findSubstring("abc", "bc"));//1
		System.out.println(findSubstring("abc", "z"));//-1
		System.out.println(findSubstring("a", "abc"));//-1
	}

}
