package object;

/**
 * Created with IntelliJ IDEA.
 * User: yf_liu
 * Date: 2015/4/29
 * Time: 10:52
 */
public class IntsUtils {
    public static int[] rotate(int[] ints, int k) {
        k %= ints.length;
        int[] n = new int[ints.length];
        for (int i = 0; i != ints.length - k; i++) {
            n[i + k] = ints[i];
        }
        for (int i = 0; i != k; i++) {
            n[i] = ints[ints.length - k + i];
        }
        return n;
    }

    public static int[] makeArray(int k) {
        int[] ints = new int[k];
        for (int i = 0; i != k; i++) {
            ints[i] = i;
        }
        return ints;
    }

    public static int[] makeDuplicateArray(int k, int d) {
        int[] ints = new int[k];
        for (int i = 0; i != d; i++) {
            ints[d] = 0;
        }
        for (int i = d; i != k; i++) {
            ints[i] = i;
        }
        return ints;
    }

    public static int[] subArray(int[] ints, int k) {
        k %= ints.length;
        int[] n = new int[k];
        for (int i = 0; i != k; i++) {
            n[i] = ints[i];
        }
        return n;
    }

    public static void print(int[] ints) {
        System.out.print("{");
        for (int i = 0; i != ints.length; i++) {
            System.out.print(ints[i] + ", ");
        }
        System.out.println("}");
    }

    public static int[] existElem(int[][] matrix) {
        int row = matrix.length, col = matrix[0].length;
        int size = row * col;
        int[] exists = new int[size];

        for (int k = 0; k != size; k++) {
            exists[k] = matrix[k / col][k % col];
        }
        return exists;
    }
}
