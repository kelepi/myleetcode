import java.util.Stack;

/**
 * Created with IntelliJ IDEA.
 * User: yf_liu
 * Date: 2015/6/2
 * Time: 15:26
 */
/*
Given a string containing just the characters '(' and ')',
find the length of the longest valid (well-formed) parentheses substring.

For "(()", the longest valid parentheses substring is "()", which has length = 2.

Another example is ")()())", where the longest valid parentheses substring is "()()", which has length = 4.
 */
public class LongestValidParentheses {
    public int longestValidParentheses(String s) {
        int[] ints = new int[s.length()];
        for (int i = 0; i != ints.length; i++) {
            ints[i] = -1;
        }
        Stack<Integer> stack = new Stack<Integer>();
        int left = 0;
        for (int i = 0; i != s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(') {
                left++;
                stack.push(i);
            } else {
                if (left != 0) {
                    left--;
                    ints[i] = stack.pop();
                }
            }
        }
        int max = 0, curMax = 0;

        for (int i = s.length() - 1; i >= 0; ) {
            if (ints[i] != -1) {
                curMax += (i - ints[i]) + 1;
                i = ints[i] - 1;
                if (i < 0) {
                    max = Math.max(max, curMax);
                }
            } else {
                max = Math.max(max, curMax);
                curMax = 0;
                i--;
            }
        }
        return max;
    }
}
