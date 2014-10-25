package parentheses;

import java.util.Stack;

/**
 * @see http://codegolf.stackexchange.com/questions/11917/fix-unbalanced-brackets
 */
public class FixUnbalancedBrackets {

	public static void main(String[] args) {
		System.out.println(" -> " + getFixed("")); // blank
		System.out.println("()[] -> " + getFixed("()[]")); // ()[]
		System.out.println("[ -> " + getFixed("[")); // []
		System.out.println("( -> " + getFixed("(")); // ()
		System.out.println("{ -> " + getFixed("{")); // {}
		System.out.println("< -> " + getFixed("<")); // <>
		System.out.println("] -> " + getFixed("]")); // []
		System.out.println(") -> " + getFixed(")")); // ()
		System.out.println("} -> " + getFixed("}")); // {}
		System.out.println("> -> " + getFixed(">")); // <>
		System.out.println("{}] -> " + getFixed("{}]")); // [{}] or {}[]
		System.out.println("<< -> " + getFixed("<<")); // <><> or <<>>
		System.out.println("{}]) -> " + getFixed("{}])")); // ([{}]) or {}[]()
		System.out.println("(())) -> " + getFixed("(()))")); // (())() or ((())) or ()()()()
		System.out.println("((()) -> " + getFixed("((())")); // ()(()) or ((())) or ()()()()
		System.out.println("([{}] -> " + getFixed("([{}]")); // ()[{}] or ([{}]) or ()[]{}[]
	}

	public static String getFixed(String string) {
		String fixed = "";

		Stack<Character> stack = new Stack<Character>();
		Stack<Integer> unbalancedIndices = new Stack<Integer>();
		char c;
		for (int i = 0; i < string.length(); i++) {
			c = string.charAt(i);
			
			if (c == '[' || c == '{' || c == '(' || c == '<') {
				stack.push(c);
				unbalancedIndices.push(i);
			} else if (c == ']') {
				if (!stack.isEmpty()) {
					if (stack.peek() == '[') {
						if (!unbalancedIndices.isEmpty()) {
							unbalancedIndices.pop();
						}
					} else {
						unbalancedIndices.push(i);
					}
				} else {
					unbalancedIndices.push(i);
				}
				stack.push(c);
			} else if (c == '}') {
				if (!stack.isEmpty()) {
					if (stack.peek() == '{') {
						if (!unbalancedIndices.isEmpty()) {
							unbalancedIndices.pop();
						}
					} else {
						unbalancedIndices.push(i);
					}
				} else {
					unbalancedIndices.push(i);
				}
				stack.push(c);
			} else if (c == ')') {
				if (!stack.isEmpty()) {
					if (stack.peek() == '(') {
						if (!unbalancedIndices.isEmpty()) {
							unbalancedIndices.pop();
						}
					} else {
						unbalancedIndices.push(i);
					}
				} else {
					unbalancedIndices.push(i);
				}
				stack.push(c);
			} else if (c == '>') {
				if (!stack.isEmpty()) {
					if (stack.peek() == '<') {
						if (!unbalancedIndices.isEmpty()) {
							unbalancedIndices.pop();
						}
					} else {
						unbalancedIndices.push(i);
					}
				} else {
					unbalancedIndices.push(i);
				}
				stack.push(c);
			}
		}
		
		if (!unbalancedIndices.isEmpty()) {
			int index = unbalancedIndices.pop();
			String pre = "";
			String post = "";
			
			for (int i = 0; i < index; i++) {
				pre += stack.get(i);
			}
			for (int i = index + 1; i < stack.size(); i++) {
				post += stack.get(i);
			}

			String temp = "";
			char d = stack.get(index);
			if (d == '[' || d == ']') {
				temp = "[]";
			} else if (d == '{' || d == '}') {
				temp = "{}";
			} else if (d == '(' || d == ')') {
				temp = "()";
			} else if (d == '<' || d == '>') {
				temp = "<>";
			}
			
			return getFixed(pre + temp + post);
		} else {
			int size = stack.size();
			for (int i = 0; i < size; i++) {
				fixed += stack.get(i);
			}
		}
		
		return fixed;
	}
}
