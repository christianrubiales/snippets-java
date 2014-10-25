package parentheses;

import java.util.Stack;


/**
 * @see http://mattcb.blogspot.com/2012/12/valid-parentheses.html
 */
public class ValidParenthesesMultipleCharacterTypesUsingStack {

	public static void main(String[] args) {
		System.out.println("true = " + isValid("()")); // true
		System.out.println("true = " + isValid("()()()")); // true
		System.out.println("false = " + isValid("((")); // false
		System.out.println("false = " + isValid("(()")); // false
		System.out.println("false = " + isValid("))")); // false
		System.out.println("false = " + isValid(")(")); // false
		System.out.println("true = " + isValid("((()))")); // true
		System.out.println("true = " + isValid("((()()()))")); // true
		System.out.println("true = " + isValid("()[]{}")); // true
		System.out.println("true = " + isValid("([{}{}[]])")); // true
		System.out.println("false = " + isValid("(]")); // false
		System.out.println("false = " + isValid("([)]")); // false
		System.out.println("false = " + isValid("(a[b)c]d")); // false
		System.out.println("true = " + isValid("a(b)c")); // true
	}
	
	public static boolean isValid(String string) {
		Stack<Character> stack = new Stack<Character>();
		char c;
		int count = 0;
		for (int i = 0; i < string.length(); i++) {
			c = string.charAt(i);
			
			if (c == '[' || c == '{' || c == '(' ) {
				count++;
				stack.push(c);
			} else if (c == ']') {
				count--;
				if (!stack.isEmpty()) {
					if (stack.peek() == '[') {
						stack.pop();
					} else { // short-circuit
						return false;
					}
				}
			} else if (c == '}') {
				count--;
				if (!stack.isEmpty()) {
					if (stack.peek() == '{') {
						stack.pop();
					} else { // short-circuit
						return false;
					}
				}
			} else if (c == ')') {
				count--;
				if (!stack.isEmpty()) {
					if (stack.peek() == '(') {
						stack.pop();
					} else { // short-circuit
						return false;
					}
				}
			}
		}
		
		return stack.isEmpty() && count == 0;
	}

}
