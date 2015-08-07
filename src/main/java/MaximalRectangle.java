import java.util.Stack;

/**
 * Created with IntelliJ IDEA.
 * User: yf_liu
 * Date: 2015/5/12
 * Time: 9:39
 */
public class MaximalRectangle {
    public int maximalRectangle(char[][] matrix) {
        if (matrix == null || matrix.length == 0 || matrix[0] == null || matrix[0].length == 0) {
            return 0;
        }
        int max = 0;
        int row = matrix.length, col = matrix[0].length;
        for (int i = 0; i != row; i++) {
            for (int j = 0; j != col; j++) {
                if (matrix[i][j] == '1') {
                    int[] histogram = new int[row - i];
                    for (int k = i; k != row; k++) {
                        int cnt = 0;
                        for (int m = j; m != col; m++) {
                            if (matrix[k][m] == '1') {
                                cnt++;
                            } else {
                                break;
                            }
                        }
                        histogram[k - i] = cnt;
                    }
                    int area = largestRectangleArea(histogram);
                    max = Math.max(max, area);
                }
            }
        }
        return max;
    }

    public int largestRectangleArea(int[] height) {
        Stack<Integer> stack = new Stack<Integer>();
        int max = 0, i = 0, len = height.length;

        while(i <= len) {
            int val = (i == len) ? 0 : height[i];
            if (stack.empty() || height[stack.peek()] <= val) {
                stack.push(i);
                i++;
            } else {
                int area = height[stack.pop()] * (stack.empty() ? i : i - stack.peek() - 1);
                max = Math.max(max, area);
            }
        }
        return max;
    }
}
