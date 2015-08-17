/**
 * Created with IntelliJ IDEA.
 * User: yf_liu
 * Date: 2015/4/29
 * Time: 11:40
 */
/*
Write an efficient algorithm that searches for a value in an m x n matrix. This matrix has the following properties:

Integers in each row are sorted from left to right.
The first integer of each row is greater than the last integer of the previous row.
For example,

Consider the following matrix:

[
  [1,   3,  5,  7],
  [10, 11, 16, 20],
  [23, 30, 34, 50]
]
Given target = 3, return true.
 */
public class Searcha2DMatrix {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = matrix.length;
        int col = matrix[0].length;
        if (target < matrix[0][0] || target > matrix[row - 1][col - 1]) {
            return false;
        }
        int targetRow = rowBS(matrix, 0, row - 1, target);
        return colBS(matrix[targetRow], 0, col - 1, target);
    }

    public boolean colBS(int[] matrixRow, int start, int end, int target) {
        if (start > end) {
            return false;
        }
        int mid = (start + end) / 2;
        if (matrixRow[mid] < target) {
            return colBS(matrixRow, mid + 1, end, target);
        } else if (matrixRow[mid] > target) {
            return colBS(matrixRow, start, mid - 1, target);
        } else {
            return true;
        }
    }

    public int rowBS(int[][] matrix, int start, int end, int target) {
        int idx = rowBSImpl(matrix, start, end, target);
        return idx == 0 ? idx : idx - 1;
    }

    public int rowBSImpl(int[][] matrix, int start, int end, int target) {
        if (start == end) {
            return matrix[start][0] <= target ? start + 1 : start;
        }
        int mid = (start + end) / 2;
        if (matrix[mid][0] < target) {
            return rowBSImpl(matrix, start + 1, end, target);
        } else if (matrix[mid][0] > target) {
            return rowBSImpl(matrix, start, end - 1, target);
        } else {
            return mid + 1;
        }
    }
}
