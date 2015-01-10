package math.counting;

/**
 * @see http://en.wikipedia.org/wiki/Heap%27s_algorithm
 */
public class HeapsPermutationRecursive {

	public static void main(String[] args) {
		generate("ABC".toCharArray());
		generate("1234".toCharArray());
	}

	public static void generate(char[] array) {
		generate(array.length - 1, array);
	}
	
	public static void generate(int n, char[] array) {
		if (n == 0) {
			System.out.println(array);
		} else {
			for (int i = 0; i <= n; i++) {
				generate(n - 1, array);
				int j = 0;
				if (n % 2 == 0) {
					j = 1;
				} else {
					j = i;
				}
				swap(array, n, j);
			}
		}
	}
	
	public static void swap(char[] array, int i, int j) {
		char temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}

}
