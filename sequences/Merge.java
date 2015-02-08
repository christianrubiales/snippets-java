package sequences;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Tricky parts: use of template T, Comparable, and compareTo()
 */
public class Merge<T extends Comparable<T>> {

	public static void main(String[] args) {
		Merge<Integer> merger = new Merge<Integer>();
		
		List<Integer> list1 = Arrays.asList(new Integer[]{1,3,5,7,9});
		List<Integer> list2 = Arrays.asList(new Integer[]{2,4,6,8});
		System.out.println(merger.merge(list1, list2));
		
		list1 = Arrays.asList(new Integer[]{1,3,5,7,9});
		list2 = Arrays.asList(new Integer[]{});
		System.out.println(merger.merge(list1, list2));
		
		list1 = Arrays.asList(new Integer[]{});
		list2 = Arrays.asList(new Integer[]{1,3,5,7,9});
		System.out.println(merger.merge(list1, list2));
		
		list1 = Arrays.asList(new Integer[]{1,2,3});
		list2 = Arrays.asList(new Integer[]{4,5,6,7});
		System.out.println(merger.merge(list1, list2));
		
		list1 = Arrays.asList(new Integer[]{4,5,6,7});
		list2 = Arrays.asList(new Integer[]{1,2,3});
		System.out.println(merger.merge(list1, list2));
		
		list1 = Arrays.asList(new Integer[]{});
		list2 = Arrays.asList(new Integer[]{});
		System.out.println(merger.merge(list1, list2));
		
		Merge<Character> merger2 = new Merge<Character>();
		List<Character> list3 = Arrays.asList(new Character[]{'1','3','5','7','9'});
		List<Character> list4 = Arrays.asList(new Character[]{'2','4','6','8'});
		System.out.println(merger2.merge(list3, list4));

		list3 = Arrays.asList(new Character[]{'a','c','e','g','i'});
		list4 = Arrays.asList(new Character[]{'b','d','f','h',});
		System.out.println(merger2.merge(list3, list4));
	}
	
	public List<T> merge(List<T> list1, List<T> list2) {
		List<T> list = new ArrayList<T>();
		int i1 = 0, i2 = 0;

		while (i1 < list1.size() && i2 < list2.size()) {
			// add the smaller item into the returned list
			// then increment the counter for the source list
			if (list1.get(i1).compareTo(list2.get(i2)) < 0) {
				list.add(list1.get(i1));
				i1++;
			} else {
				list.add(list2.get(i2));
				i2++;
			}
		}
		
		// add whatever is left into the returned array
		for (int i = i1; i < list1.size(); i++) {
			list.add(list1.get(i));
		}

		// add whatever is left into the returned array
		for (int i = i2; i < list2.size(); i++) {
			list.add(list2.get(i));
		}
		
		return list;
	}

}
