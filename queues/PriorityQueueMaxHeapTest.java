package queues;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Random;

/**
 * Using a reverse comparator will put the max on head of the priority queue (max heap).
 */
public class PriorityQueueMaxHeapTest {

	public static void main(String[] args) {
		Comparator<Integer> comparator = new Comparator<Integer>() {
			public int compare(Integer o1, Integer o2) {
				return o2.compareTo(o1);
			}
		};
		
		PriorityQueue<Integer> queue = new PriorityQueue<Integer>(11, comparator);
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
