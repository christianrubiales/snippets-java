package string;

import java.util.Arrays;

/**
 * @see Goodrich/Tamassia
 */
public class KMP {

	public static int kmp(String haystack, String needle) {
		int n = haystack.length();
		int m = needle.length();
		
		if (m > n) {
			return -1;
		}
		
		Integer[] F = fail(needle);
		int i = 0;
		int j = 0;
		
		while (i < n) {
			if (needle.charAt(j) == haystack.charAt(i)) {
				if (j == m - 1) {
					return i - m + 1;
				}
				i++;
				j++;
			} else if (j > 0) {
				j = F[j - 1];
			} else {
				i++;
			}
		}
		
		return -1;
	}
	
	public static Integer[] fail(String pattern) {
		int i = 1;
		int j = 0;
		int m = pattern.length();
		Integer[] F = new Integer[m];
		F[0] = 0;
		
		while (i < m) {
			if (pattern.charAt(j) == pattern.charAt(i)) {
				F[i] = j + 1;
				j++;
				i++;
			} else if (j > 0) {
				j = F[j - 1];
			} else {
				F[i] = 0;
				i++;
			}
		}
		
		return F;
	}
	
	public static void main(String[] args) {
		System.out.println(Arrays.deepToString(fail("z"))); // [0, 0, 1, 0, 1, 2]
		System.out.println(Arrays.deepToString(fail("abacab"))); // [0, 0, 1, 0, 1, 2]
		System.out.println(Arrays.deepToString(fail("abcdabd")));// [0, 0, 0, 0, 1, 2, 0]
		System.out.println(Arrays.deepToString(fail("aaa"))); // [0, 0, 1]
		System.out.println(Arrays.deepToString(fail("aaaa"))); // [0, 0, 1, 2]
		System.out.println(kmp("0123456789", "567"));//5
		System.out.println(kmp("bananabanana", "nab"));//45
		System.out.println(kmp("abc", "z"));//-1
		System.out.println(kmp("a", "abc"));//-1
	}

}
