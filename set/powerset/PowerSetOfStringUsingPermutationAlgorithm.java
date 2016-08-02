package set.powerset;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class PowerSetOfStringUsingPermutationAlgorithm {
	
	public static Set<String> powerset(String string) {
		Set<String> power = new LinkedHashSet<String>();
		
		powerset("", string, power);
		
		return power;
	}
	
	public static void powerset(String prefix, String string, Set<String> powerset) {
		char[] arr = prefix.toCharArray();
		Arrays.sort(arr);
		String temp = new String(arr);
		powerset.add(temp);
		
		for (int i = 0; i < string.length(); i++) {
			powerset(prefix + string.charAt(i), string.substring(0, i) + string.substring(i+1), powerset);
		}
	}

	public static void main(String[] args) {
		System.out.println(powerset(""));
		System.out.println(powerset("1"));
		System.out.println(powerset("12"));
		System.out.println(powerset("123"));
		System.out.println(powerset("1234"));
		System.out.println(powerset("abcdefghij"));
	}

}
