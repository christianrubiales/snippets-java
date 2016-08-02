package set.powerset;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class PowerSetUsingPermutationAlgorithm<T> {
	
	public Set<Set<T>> powerset(T[] items) {
		Set<Set<T>> power = new LinkedHashSet<Set<T>>();
		
		powerset(new LinkedHashSet<T>(), new ArrayList(Arrays.asList(items)), power);
		
		return power;
	}
	
	public void powerset(Set<T> prefix, List<T> list, Set<Set<T>> powerset) {
		powerset.add(prefix);
		for (int i = 0; i < list.size(); i++) {
			List<T> tempList = new ArrayList<>(list);
			Set<T> tempPrefix = new HashSet<>(prefix);
			tempPrefix.add(tempList.remove(i));
			powerset(tempPrefix, tempList, powerset);
		}
	}

	public static void main(String[] args) {
		PowerSetUsingPermutationAlgorithm<Object> power = new PowerSetUsingPermutationAlgorithm<>();
		System.out.println(power.powerset(new Integer[]{}));
		System.out.println(power.powerset(new Integer[]{1}));
		System.out.println(power.powerset(new Integer[]{1, 2}));
		System.out.println(power.powerset(new Integer[]{1, 2, 3}));
		System.out.println(power.powerset(new Integer[]{1, 2, 3, 4}));
		System.out.println(power.powerset(new Integer[]{1, 2, 3, 4, 5}));
		System.out.println(power.powerset(new Character[]{'a', 'b', 'c'}));
	}

}
