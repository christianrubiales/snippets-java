package sequences;

import java.util.Arrays;
import java.util.Random;

/**
 * Just be careful with the indices.
 */
public class FisherYatesShuffle {

	public static void main(String[] args) {
		System.out.println(Arrays.deepToString(shuffle(new Object[]{0,1,2,3,4,5,6,7,8,9})));
		System.out.println(Arrays.deepToString(shuffle(new Object[]{1,2,3,4,5})));
		System.out.println(Arrays.deepToString(shuffle(new Object[]{"cat","dog","rat","bat","pig"})));
		System.out.println(Arrays.deepToString(shuffle(new Object[]{1})));
	}
	
	public static Object[] shuffle(Object[] array) {
		Random random = new Random();
		int j, k;
		Object t;
//		System.out.println(Arrays.deepToString(array));
		for (int i = 0; i < array.length; i++) {
			k = random.nextInt(array.length - i);
			j = i + k;
			// swap
			t = array[j];
			array[j] = array[i];
			array[i] = t;
//			System.out.println(i + " " + k + " " + j + " " + Arrays.deepToString(array));
		}
		
		return array;
	}

}
