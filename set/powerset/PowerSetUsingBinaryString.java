package set.powerset;

import java.util.LinkedHashSet;
import java.util.Set;

public class PowerSetUsingBinaryString {

	public static Set<Set<Object>> powerset(Object[] items) {
		Set<Set<Object>> power = new LinkedHashSet<Set<Object>>();
		
		int n = (int) Math.pow(2, items.length);
		for (int i = 0; i < n; i++) {
			Set<Object> set = new LinkedHashSet<Object>();
			String bitset = Integer.toBinaryString(i);
			for (int j = 0; j < bitset.length(); j++) {
				if (bitset.charAt(j) == '1') {
					set.add(items[j]);
				}
			}
			power.add(set);
		}
		
		return power;
	}
	
	public static void main(String[] args) {
		System.out.println(powerset(new Object[]{}));
		System.out.println(powerset(new Object[]{1}));
		System.out.println(powerset(new Object[]{1, 2}));
		System.out.println(powerset(new Object[]{1, 2, 3}));
		System.out.println(powerset(new Object[]{1, 2, 3, 4}));
		System.out.println(powerset(new Object[]{1, 2, 3, 4, 5}));
		System.out.println(powerset(new Object[]{'a', 'b', 'c'}));
	}

}
