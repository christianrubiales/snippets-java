package puzzle;

import java.util.HashMap;
import java.util.Map;

/**
 * @see http://www.glassdoor.com/Interview/Dropbox-Interview-RVW4964033.htm
 */
public class FollowsPattern {

	public static void main(String[] args) {
		System.out.println(followsPattern("a b b a", "cat dog dog cat")); // true
		System.out.println(followsPattern("a b b a", "cat dog dog dog")); // false
		System.out.println(followsPattern("", "")); // true
		System.out.println(followsPattern("cat dog dog cat", "a b b a")); // true

	}

	public static boolean followsPattern(String pattern, String string) {
		Map<String, String> map = new HashMap<String, String>();
		String[] patternArray = pattern.split(" ");
		String[] stringArray = string.split(" ");
		
		if (patternArray.length != stringArray.length) {
			return false;
		} else {
			for (int i = 0; i < patternArray.length; i ++) {
				if (!map.containsKey(patternArray[i])) {
					map.put(patternArray[i], stringArray[i]);
				} else {
					if (!map.get(patternArray[i]).equals(stringArray[i])) {
						return false;
					}
				}
			}
		}
		
		return true;
	}
}
