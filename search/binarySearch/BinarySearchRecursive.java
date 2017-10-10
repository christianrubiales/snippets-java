package search.binarySearch;

public class BinarySearchRecursive {
	
	static int binarySearch(int value, int[] A) {
		return binarySearch(value, A, 0, A.length - 1);
	}

	static int binarySearch(int value, int[] A, int low, int high) {
		if (low > high) {
			return -1;
		}
		int mid = low + (high - low)/2;
		
		if (A[mid] == value) {
			return mid;
		} else if (A[mid] > value) {
			return binarySearch(value, A, low, mid - 1);
		} else {
			return binarySearch(value, A, mid + 1, high);
		}
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
