package sequences;

import java.util.Arrays;
import java.util.List;

/**
 * Boyer-Moore Majority Vote Algorithm
 * 
 * @see http://www.cs.utexas.edu/~moore/best-ideas/mjrty/
 */
public class MajorityVote<T> {

	public static void main(String[] args) {
		MajorityVote<Character> algorithm1 = new MajorityVote<Character>();
		System.out.println(algorithm1.getMajority(Arrays.asList(new Character[]{'a','a','a','c','c','b','b','c','c','c','b','c','c'})));

		MajorityVote<String> algorithm2 = new MajorityVote<String>();
		System.out.println(algorithm2.getMajority(Arrays.asList(new String[]{"a","a","a","c","c","b","b","c","c","c","b","c","c"})));
		System.out.println(algorithm2.getMajority(Arrays.asList(new String[]{"a","a","b"})));
		System.out.println(algorithm2.getMajority(Arrays.asList(new String[]{"a","b","b"})));
		System.out.println(algorithm2.getMajority(Arrays.asList(new String[]{"b","a","b"})));
		System.out.println(algorithm2.getMajority(Arrays.asList(new String[]{"a","b","a"})));
		System.out.println(algorithm2.getMajority(Arrays.asList(new String[]{"a","b"})));
		System.out.println(algorithm2.getMajority(Arrays.asList(new String[]{"a"})));
	}

	public T getMajority(List<T> elements) {
		T majority = null;
		int count = 0;
		
		for (int i = 0; i < elements.size(); i++) {
			if (count == 0) {
				majority = elements.get(i);
				count = 1;
			} else {
				if (majority.equals(elements.get(i))) {
					count++;
				} else {
					count--;
				}
			}
		}
		
		
		return majority;
	}
}
