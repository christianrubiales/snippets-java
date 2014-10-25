package parentheses;


/**
 * @see http://mattcb.blogspot.com/2012/12/valid-parentheses.html
 */
public class ValidParenthesesSingleCharacterTypeUsingArray {

	public static void main(String[] args) {
		System.out.println("true = " + isValid("()")); // true
		System.out.println("true = " + isValid("()()()")); // true
		System.out.println("false = " + isValid("((")); // false
		System.out.println("false = " + isValid("(()")); // false
		System.out.println("false = " + isValid("))")); // false
		System.out.println("false = " + isValid(")(")); // false
		System.out.println("true = " + isValid("((()))")); // true
		System.out.println("true = " + isValid("((()()()))")); // true
		System.out.println("true = " + isValid("a(b)c")); // true
	}
	
	public static boolean isValid(String string) {
		// remove non-parentheses
		String temp = "";
		for (int i = 0; i < string.length(); i++) {
			if (string.charAt(i) == '(' || string.charAt(i) == ')' ) {
				temp += string.charAt(i);
			}
		}
		string = temp;
		
		int count = 0;
		int index = 0;
		char[] array = string.toCharArray();
		char c;
		for (int i = 0; i < array.length; i++) {
			c = string.charAt(i);
			if ('(' == c) {
				count++;
				index++;
			} else if (')' == c) {
				count--;
				if (index - 1 >= 0 && array[index-1] == '(') {
					index--;
				}
			}
		}
		
		return count == 0 && index == 0;
	}

}
