package set;

/**
 * @see http://en.wikipedia.org/wiki/3SUM
 */
public class R3SUMNaive {

	public static void main(String[] args) {
		int[] set = new int[]{-7, -3, -2, 5, 8};
		for (int i : getSubset(set, 0)) {//{-3, -2, 5}
			System.out.println(i);
		}
	}
	
	public static int[] getSubset(int[] set, int sum) {
		for (int i = 0; i < set.length; i++) {
			for (int j = 0; j < set.length; j++) {
				for (int k = 0; k < set.length; k++) {
					if ((i != j && j != k && i != k) && (set[i] + set[j] + set[k] == sum)) {
						return new int[]{set[i], set[j], set[k]};
					}
				}
			}
		}
		
		return new int[]{};
	}

}
