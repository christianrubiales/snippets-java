package set;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/**
 * @see http://en.wikipedia.org/wiki/3SUM
 */
public class R3SUMAllSubsetsNaive {

	public static void main(String[] args) {
		int[] set = new int[]{-7, -3, -2, 5, 8};
		for (int[] subset : getSubsets(set, 0)) {//{-3, -2, 5}
			for (int i : subset) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
		System.out.println();

		set = new int[]{-1, 0, 1, 2, -1, -4};
		for (int[] subset : getSubsets(set, 0)) {//{-1, 0, 1}, {-1, -1, 2}
			for (int i : subset) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
		System.out.println();
	}
	
	public static Set<int[]> getSubsets(int[] set, int sum) {
		Map<String, int[]> map = new LinkedHashMap<String, int[]>();
		Set<int[]> subsets = new LinkedHashSet<int[]>();
		int[] subset;
		for (int i = 0; i < set.length; i++) {
			for (int j = 0; j < set.length; j++) {
				for (int k = 0; k < set.length; k++) {
					if ((i != j && j != k && i != k) && (set[i] + set[j] + set[k] == sum)) {
						subset = new int[]{set[i], set[j], set[k]};
						Arrays.sort(subset);
						String key = "";
						for (int m = 0; m < 3; m++) {
							key += subset[m] + "-";
						}
						map.put(key, subset);
					}
				}
			}
		}
		for (String key : map.keySet()) {
			subsets.add(map.get(key));
		}
		
		return subsets;
	}

}
