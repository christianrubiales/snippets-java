package string;

import java.util.PriorityQueue;

public class AnagramsUsingPriorityQueueLinearithmic {

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
			b1 = sort(b1); // O(n log n)
			b2 = sort(b2); // O(n log n)
			
			for (int i = 0; i < s1.length(); i++) {
				if (b1[i] != b2[i]) {
					return false;
				}
			}
		}
		
		return true;
	}
	
	public static char[] sort(char[] array) {
		char[] returnArray = new char[array.length];
		
		PriorityQueue<Character> queue = new PriorityQueue<Character>(array.length);
		for (int i = 0; i < array.length; i++) {
			queue.offer(array[i]);
		}
		for (int i = 0; i < array.length; i++) {
			returnArray[i] = queue.poll();
		}
		return returnArray;
	}

}
