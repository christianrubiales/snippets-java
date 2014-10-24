package array;

import java.util.PriorityQueue;

/**
 * Uses PriorityQueue, poll() REMOVES the head of the queue.
 * 
 * @see http://www.glassdoor.com/Interview/MongoDB-Interview-RVW3517833.htm
 */
public class SquareAllElementsAndKeepSortedUsingPriorityQueue {

	public static void main(String[] args) {
		int[] array = squareAndKeepSorted(new int[]{-3, -2, -1, 0, 1, 2, 3}); // [0, 1, 1, 4, 4, 9, 9]
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}

	/**
	 * Goes through each array contents starting at the first element,
	 * squares that element and adds the result to a PriorityQueue.
	 * Successively removes the head of the PriorityQueue and puts the value into
	 * an array.
	 */
	public static int[] squareAndKeepSorted(int[] array) {
		int[] processed = new int[array.length];
		PriorityQueue<Integer> queue = new PriorityQueue<Integer>();
		
		// O(n log n), linearithmic due to performing O(log n) operation (offer()) n times
		for (int i = 0; i < array.length; i++) {
			queue.offer(array[i] * array[i]);
		}
		
		// O(n log n), linearithmic due to performing O(log n) operation (poll()) n times
		for (int i = 0; i < array.length; i++) {
			processed[i] = queue.poll();
		}
		
		return processed;
	}
	
}
