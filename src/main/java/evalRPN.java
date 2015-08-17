import java.util.Stack;

/**
 * Created by liuyufan on 14-2-22.
 */
public class evalRPN {
    private Stack<String> stack = new Stack<String>();

    private boolean isOperator(String token) {
        return token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/");
    }

    private int getResult(String operator, int leftVal, int rightVal) {
        if (operator.equals("+")) {
            return leftVal + rightVal;
        }
        if (operator.equals("-")) {
            return leftVal - rightVal;
        }
        if (operator.equals("*")) {
            return leftVal * rightVal;
        }
        if (operator.equals("/")) {
            return leftVal / rightVal;
        }
        return -1;
    }

    public int evalRPN(String[] tokens) {
        stack.clear();
        Integer tempVal, leftVal, rightVal;
        for (String token : tokens) {
            if (isOperator(token)) {
                if (stack.size() >= 2) {
                    rightVal = Integer.parseInt(stack.pop());
                    leftVal = Integer.parseInt(stack.pop());
                    tempVal = getResult(token, leftVal, rightVal);
                    stack.push(String.valueOf(tempVal));
                } else {
                }
            } else {
                stack.add(token);
            }
        }
        return Integer.parseInt(stack.pop());
    }

    public static void main(String[] args) {
        evalRPN evalRPN = new evalRPN();

        String[] testA = {"2", "1", "+", "3", "*"};
        String[] testB = {"4", "13", "5", "/", "+"};

        System.out.println(evalRPN.evalRPN(testA));
        System.out.println(evalRPN.evalRPN(testB));
        System.out.println(evalRPN.isOperator("+"));
        System.out.println(evalRPN.isOperator("ss"));

    }
}
