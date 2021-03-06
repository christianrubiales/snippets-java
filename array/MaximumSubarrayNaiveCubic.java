package array;

public class MaximumSubarrayNaiveCubic {

	public static void main(String[] args) {
		System.out.println(getMaximumSubarraySum(new int[] {13, -3, -25, 20, -3, -16, -23, 18, 20, -7, 12, -5, -22, 15, -4, 7}));// 43 CLRS
		System.out.println(getMaximumSubarraySum(new int[] {-2, 1, -3, 4, -1, 2, 1, -5, 4}));// 6 http://en.wikipedia.org/wiki/Maximum_subarray_problem
	}
	
	/**
	 * Try all possible pairs and get the maximum sum.
	 */
	public static int getMaximumSubarraySum(int[] array) {
		int max = 0;
		int sum = 0;
		
		for (int i = 0; i < array.length - 1; i++) {
			for (int j = i + 1; j < array.length; j++) {
				sum = 0;
				for (int k = i; k < j; k++) {
					sum += array[k];
				}
				if (sum > max) {
					max = sum;
				}
			}	
		}
		
		return max;
	}

}
