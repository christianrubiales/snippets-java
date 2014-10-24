package puzzle;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FollowsPatternUsingList {

	public static void main(String[] args) {
		System.out.println(followsPattern("a b b a", "cat dog dog cat")); // true
		System.out.println(followsPattern("a b b a", "cat dog dog dog")); // false
		System.out.println(followsPattern("", "")); // true
		System.out.println(followsPattern("cat dog dog cat", "a b b a")); // true
	}

	public static boolean followsPattern(String pattern, String string) {
		List<String> list1 = new ArrayList<String>();
		List<String> list2 = new ArrayList<String>();
		String[] patternArray = pattern.split(" ");
		String[] stringArray = string.split(" ");
		
		if (patternArray.length != stringArray.length) {
			return false;
		} else {
			for (int i = 0; i < patternArray.length; i ++) {
				if (!list1.contains(patternArray[i])) {
					list1.add(patternArray[i]);
				}
				if (!list2.contains(stringArray[i])) {
					list2.add(stringArray[i]);
				}
			}
		}
		
		System.out.println(list1.toString());
		System.out.println(list2.toString());
		return list1.toString().equals(list2.toString());
	}

}
