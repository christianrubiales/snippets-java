package math;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NegaBinary {

	public static void main(String[] args) {
		System.out.println(Arrays.deepToString(binaryToNegabinary(new Integer[]{1,0,0,1,1})));//1,1,0,1
		System.out.println(Arrays.deepToString(binaryToNegabinary(new Integer[]{1,0,0,1,1,1})));//1,1,0,1,0,1,1
	}

	static int binaryToInt(Integer[] negabits) {
		int val = 0;
		
		for (int i = 0; i < negabits.length; i++) {
			val += negabits[i] * Math.pow(-2, i);
		}
		
		return val;
	}

	static Integer[] intToNegabinary(int val) {
		List<Integer> list = new ArrayList<>();
		
		while (val != 0) {
			int div = (int) Math.ceil(val / -2.0);
			int rem = val % -2;
			val = div;
			list.add(Math.abs(rem));
		}
		
		Integer[] negabinary = new Integer[list.size()];
		for (int i = 0; i < list.size(); i++) {
			negabinary[i] = list.get(i);
		}
		
		return negabinary;
	}
	
	static Integer[] binaryToNegabinary(Integer[] binarybits) {
		int val = binaryToInt(binarybits);
		return intToNegabinary(-val);
	}
}
