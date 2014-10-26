package array;

/**
 * Answer copied from http://www.glassdoor.com/Interview/First-I-was-asked-a-few-basic-design-questions-like-how-I-would-design-an-online-chat-system-with-separate-room-Then-I-wa-QTN_599051.htm
 */
public class SquareAllElementsGlassdoor {

	public static void main(String[] args) {
		int[] array = squareSort(new int[]{-3, -2, -1, 0, 1, 2, 3}); // [0, 1, 1, 4, 4, 9, 9]
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
		
		array = squareSort(new int[]{-3, -2, -1, 4}); // [1, 4, 9, 16]
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}
	
	public static int[] squareSort(int[] array) {
        int i = 0;
        for (int k = 0; k < array.length; k++) {
            if (array[k] < 0) i = k;
            else array[k] *= array[k];
        }
        if (i > 0) {
            int old_i = i;
            int mid = i/2;
            for (int j = 0; j <= mid && i >=mid; j++, i--) {
                int temp = array[j] * array[j];
                array[j] = array[i] * array[i];
                array[i] = temp;
            }
            int[] new_array = new int[array.length];
            int k = 0, j = 0, m = old_i + 1;
            while (j <= old_i && m < array.length) {
                if (array[m] <= array[j]) new_array[k++] = array[m++];
                else new_array[k++] = array[j++];
            }
            while (j <= old_i) new_array[k++] = array[j++];
            while (m < array.length) new_array[k++] = array[m++];
            return new_array;
        } else {
            return array;
        }
    }
}
