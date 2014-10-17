package set;

import java.util.ArrayList;
import java.util.List;

public class SubsetSumNaive {

	public static void main(String[] args) {
		// http://en.wikipedia.org/wiki/Subset_sum_problem
		List<Integer> set = new ArrayList<>();
		set.add(-7);set.add(-3);set.add(-2);set.add(5);set.add(8);
		System.out.println(getSubsets(set, 0)); // -3, -2, 5
		
		// http://stackoverflow.com/questions/18432759/subset-sum-for-large-sums
		set = new ArrayList<>();
		set.add(2);set.add(3);set.add(6);set.add(8);
		System.out.println(getSubsets(set, 11)); // [2, 3, 6] and [3, 8]
	}


    public static List<List<Integer>> getSubsets(List<Integer> set, int sum) {
    	List<List<Integer>> subsets = new ArrayList<List<Integer>>();
    	
    	getSubsets(new ArrayList<Integer>(), set, subsets, sum);
    	
    	return subsets;
    }
    
    public static void getSubsets(List<Integer> pre, List<Integer> post, List<List<Integer>> list, int sum) {
    	if (!post.isEmpty()) {
	    	List<Integer> temp = new ArrayList<Integer>(pre);
	    	temp.add(post.get(0));
	    	
	    	if (getSum(temp) == sum) {
	    		list.add(temp);
	    	}
            
	    	getSubsets(temp, post.subList(1, post.size()), list, sum);
	    	getSubsets(pre, post.subList(1, post.size()), list, sum);
    	}
    }
    
    public static int getSum(List<Integer> list) {
    	int sum = 0;
    	
    	for (int i : list) {
    		sum += i;
    	}
    	
    	return sum;
    }
}
