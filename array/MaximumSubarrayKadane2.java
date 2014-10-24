package array;

public class MaximumSubarrayKadane2 {

	public static void main(String[] args) {
		System.out.println(getMaximumSubarraySum(new int[] {13, -3, -25, 20, -3, -16, -23, 18, 20, -7, 12, -5, -22, 15, -4, 7}));// 43 CLRS
		// http://en.wikipedia.org/wiki/Maximum_subarray_problem
		System.out.println(getMaximumSubarraySum(new int[] {-2, 1, -3, 4, -1, 2, 1, -5, 4}));// 6
		System.out.println(getMaximumSubarraySum(new int[] {-1, -2, -3}));// -1
		System.out.println(getMaximumSubarraySum(new int[] {-3, -2, -1}));// -1
	}
	
	public static int getMaximumSubarraySum(int[] array) {
		int maxEndingHere = array[0];
		int maxSoFar = array[0];
		
		for (int i = 0; i < array.length; i++) {
			maxEndingHere = maxEndingHere + array[i] > array[i] ? maxEndingHere + array[i] : array[i];
			maxSoFar = maxEndingHere > maxSoFar ? maxEndingHere : maxSoFar;
		}
		
		return maxSoFar;
	}

}
