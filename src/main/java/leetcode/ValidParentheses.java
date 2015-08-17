package leetcode;

import java.util.Stack;

/**
 * Created by Patrick on 15/4/8.
 */
public class ValidParentheses {
    public boolean isValid(String s) {
        if (s == null) {
            return false;
        }
        Stack<Character> stack = new Stack<Character>();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else if (stack.isEmpty()) {
                return false;
            } else if (
                    (c == ')' && !stack.empty() && stack.peek() != '(') ||
                            (c == '}' && !stack.empty() && stack.peek() != '{') ||
                            (c == ']' && !stack.empty() && stack.peek() != '[')) {
                return false;
            } else {
                stack.pop();
            }
        }
        return stack.empty();
    }
}
