package search.binarySearch;

public class BinarySearch {
	
	static int binarySearch(int value, int[] A) {
		int low = 0;
		int high = A.length - 1;
		
		while (low <= high) {
			int mid = low + (high - low)/2;
			
			if (A[mid] == value) {
				return mid;
			} else if (A[mid] > value) {
				high = mid - 1;
			} else {
				low = mid + 1;
			}
		}
		
		return -1;
	}

	public static void main(String[] args) {
		System.out.println(binarySearch(4, new int[]{}));//-1
		System.out.println(binarySearch(4, new int[]{1,2,3}));//-1
		System.out.println(binarySearch(1, new int[]{1,2,3}));//0
		System.out.println(binarySearch(2, new int[]{1,2,3}));//1
		System.out.println(binarySearch(3, new int[]{1,2,3}));//2
		System.out.println(binarySearch(3, new int[]{1,1,1,2,2,2,2,3,3,3}));//7
	}
}
