package sequences;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;


public class Selection {

    public static void select_numbers(Integer[] v, Integer k) {
    	
    	Comparator<Integer> comparator = new Comparator<Integer>() {
			public int compare(Integer o1, Integer o2) {
				return o2.compareTo(o1);
			}
		};
    	
    	PriorityQueue<Integer> queue = new PriorityQueue<Integer>(k+1,comparator);
    	
    	for (int i = 0; i < k; i++) {
    		queue.offer(v[i]);
    	}
    	
    	for (int i = k; i < v.length; i++) {
    		if (v[i] <= queue.peek()) {
    			queue.poll();
    			queue.offer(v[i]);
    		}
    	}
    	
    	List<Integer> list = new ArrayList<Integer>();
    	for (int i = 0; i < k; i++) {
    		list.add(queue.poll());
    	}
    	
    	for (int i = k - 1; i > -1; i--) {
    		System.out.print(list.get(i) + " ");
    	}
    	System.out.println();
    }
    
	public static void main(String[] args) {
		select_numbers(new Integer[]{9,1,3,7,2,2}, 3);// 1 2 2
		select_numbers(new Integer[]{1,2,8,7,3,3,1}, 2);// 1 1
	}

}
