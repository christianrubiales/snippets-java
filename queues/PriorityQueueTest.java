package queues;

import java.util.PriorityQueue;
import java.util.Random;

/**
 * Default comparator will put the min on head of the priority queue (min heap).
 */
public class PriorityQueueTest {

	public static void main(String[] args) {
		PriorityQueue<Integer> queue = new PriorityQueue<Integer>();
		Random random = new Random();
		
		int j;
		for (int i = 0; i < 10; i++) {
			j = Math.abs(random.nextInt() % 100);
			System.out.println(j);
			queue.offer(j);
		}
		System.out.println();

		for (int i = 0; i < 10; i++) {
			System.out.println(queue.poll());
		}
	}

}
