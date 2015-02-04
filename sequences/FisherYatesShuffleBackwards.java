package sequences;

import java.util.Arrays;
import java.util.Random;

/**
 * Remember Random.nextInt(n) will return 0 to n-1, so it's more suited to swapping from the last to the first item.
 */
public class FisherYatesShuffleBackwards {

	public static void main(String[] args) {
		System.out.println(Arrays.deepToString(shuffle(new Object[]{0,1,2,3,4,5,6,7,8,9})));
		System.out.println(Arrays.deepToString(shuffle(new Object[]{0,1,2,3,4,5})));
		System.out.println(Arrays.deepToString(shuffle(new Object[]{"cat","dog","rat","bat","pig"})));
		System.out.println(Arrays.deepToString(shuffle(new Object[]{1})));
	}
	
	public static Object[] shuffle(Object[] array) {
		Random random = new Random();
		Object t;
		int j;

//		System.out.println(Arrays.deepToString(array));
		for (int i = array.length - 1; i > 0; i--) {
			j = random.nextInt(i);
			
			// swap
			t = array[i];
			array[i] = array[j];
			array[j] = t;
//			System.out.println(i + " " + j + " " + Arrays.deepToString(array));
		}
		
		return array;
	}

}
