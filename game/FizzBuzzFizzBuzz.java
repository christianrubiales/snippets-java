package game;

/**
 * Print the numbers from 1 to n, printing "fizz" if the number is divisible by 3, 
 * printing "buzz" if the number is divisible by 5, 
 * and "fizzbuzz" if if the number is divisible by both 3 and 5,
 */
public class FizzBuzzFizzBuzz {

	public static void main(String[] args) {
		fizzBuzz(45);
	}

	public static void fizzBuzz(int n) {
		for (int i = 1; i <= n; i++) {
			if (i % 3 == 0) {
				if (i % 5 == 0) {
					System.out.println("fizzbuzz");
				} else {
					System.out.println("fizz");
				}
			} else if (i % 5 == 0) {
				System.out.println("buzz");
			} else {
				System.out.println(i);
			}
		}
	}
	
}
