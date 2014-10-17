package string;

import java.util.ArrayList;
import java.util.List;

public class AnagramsUsingListsQuadratic {

	public static void main(String[] args) {
		System.out.println(areAnagrams("silent", "listen")); // true
		System.out.println(areAnagrams("abc", "def")); // false
		System.out.println(areAnagrams("abc", "abcdef")); // false
	}

	public static boolean areAnagrams(String s1, String s2) {

		if (s1.length() != s2.length()) {
			return false;
		} else {
			List<Character> list1 = new ArrayList<Character>();
			List<Character> list2 = new ArrayList<Character>();
			
			// O(n^2)
			for (int i = 0; i < s1.length(); i++) {
				list1.add(s1.charAt(i)); // O(n)
			}
			// O(n^2)
			for (int i = 0; i < s2.length(); i++) {
				list2.add(s2.charAt(i)); // O(n)
			}
	
			List<Character> toRemove = new ArrayList<Character>();
			// O(n^2)
			for (int i = 0; i < s1.length(); i++) {
				toRemove.add(s1.charAt(i)); // O(n)
			}
			list1.removeAll(list2);
			
			return list1.isEmpty();
		}
		

		// Arrays.asList() can't be used
		
//		if (s1.length() != s2.length()) {
//			return false;
//		} else {
//			List list1 = Arrays.asList(s1.toCharArray());
//			List list2 = Arrays.asList(s2.toCharArray());
//			println(list1);
//			println(list2);
//			list1.removeAll(list2);
//			println(list1);
//			
//			return list1.isEmpty();
//		}
//	}
//	
//	public static void println(List list) {
//		System.out.println(list.size());
//		for (Object o : list) {
//			System.out.print(o);
//		}
//		System.out.println();
	}
}
